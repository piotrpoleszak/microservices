package com.poleszak.customer;

import com.poleszak.amqp.RabbitMQMessageProducer;
import com.poleszak.clients.fraud.FraudClient;
import com.poleszak.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer mqMessageProducer;

    public void registerCustomer(CustomerRegistrationRequest request) {
        var customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

        var response = fraudClient.isFraudster(customer.getId());

        if (response.isFraudster()) {
            throw new IllegalStateException("Fraudster");
        }

        var notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s and welcome.", customer.getFirstName())
        );

        mqMessageProducer.publish(
                notificationRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }
}
