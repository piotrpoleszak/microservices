Feature: Should create and add new customer

  Scenario: Add Customer
    Given Prepare data with path: "create_customers.json"
    When Send request to add new customer
    Then Customer should be added