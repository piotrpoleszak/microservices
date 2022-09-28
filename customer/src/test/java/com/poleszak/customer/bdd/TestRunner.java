package com.poleszak.customer.bdd;

import com.poleszak.customer.CustomerApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = {
        CustomerApplication.class,
        TestRunner.class},
        webEnvironment = DEFINED_PORT)
@CucumberOptions(plugin = {"pretty"}, snippets = CAMELCASE, features = "src/test/resources", glue = "com.poleszak.customer.bdd")
@AutoConfigureMockMvc
//@ContextConfiguration(initializers = {SpringBootContextInitializer.class})
public class TestRunner {
}
