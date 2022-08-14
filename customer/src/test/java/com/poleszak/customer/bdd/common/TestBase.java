package com.poleszak.customer.bdd.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.web.servlet.MockMvc;

public class TestBase {

    @Autowired
    protected MockMvc mvc;

    @Autowired
    protected Environment environment;
}
