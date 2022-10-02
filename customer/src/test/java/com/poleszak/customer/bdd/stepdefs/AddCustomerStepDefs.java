package com.poleszak.customer.bdd.stepdefs;

import com.poleszak.customer.bdd.common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AddCustomerStepDefs extends TestBase {

    private final static String PATH_TO_FOLDER = "src/test/resources/tests-resources/";

    private String jsonCustomerFileName;

    @Given("Prepare data with path: {string}")
    public void prepareData(String jsonCustomerFileName) {
        this.jsonCustomerFileName = jsonCustomerFileName;
    }

    @When("Send request to add new customer")
    public void addCustomer() throws Exception {

        //TODO: prepare method to read json from file
        mvc.perform(post("http://localhost:8080/api/v1/customers")
                        .accept(APPLICATION_JSON)
                        .contentType(APPLICATION_JSON)
//                        .content()
                        )
                .andExpect(status().isCreated());
    }

    @Then("Customer should be added")
    public void customerShouldBeAdded() throws Exception {
        System.out.println("aaaaaaa");
    }
}
