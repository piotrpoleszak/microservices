package com.poleszak.customer.bdd.stepdefs;

import com.poleszak.customer.bdd.common.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.hasItem;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AddCustomerStepDefs extends TestBase {

    private long age;
    private String name;
    private String jsonCustomerPath;
    private String request;

    @Given("aaa")
    public void prepareData() {
        System.out.println("aaaaaaa");
    }

//    @When("abc")
//    public void addCustomer() throws Exception {
//        mvc.perform(get("api/v1/customers")
//                .accept(APPLICATION_JSON)
//                .contentType(APPLICATION_JSON)
//                .content());
//    }

    @Then("bbb")
    public void customerShouldBeAdded() throws Exception {
        System.out.println("aaaaaaa");
    }
}
