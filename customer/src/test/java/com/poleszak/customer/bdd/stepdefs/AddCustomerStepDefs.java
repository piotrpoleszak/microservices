package com.poleszak.customer.bdd.stepdefs;

import com.poleszak.customer.bdd.common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerStepDefs extends TestBase {

    @Given("Data")
    public void test() {
        System.out.println("aaa");
    }

    @When("Add customer")
    public void test2() {
        System.out.println("aaa");
    }

    @Then("Customer is added")
    public void test3() {
        System.out.println("aaa");
    }
}
