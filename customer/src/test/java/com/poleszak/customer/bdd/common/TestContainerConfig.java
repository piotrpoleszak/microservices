package com.poleszak.customer.bdd.common;

import org.springframework.core.env.ConfigurableEnvironment;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

public class TestContainerConfig {

    private static GenericContainer<?> eurekaServerContainer = new GenericContainer<>(DockerImageName.parse("poleszak/eureka-server")).withExposedPorts(8761);

    public static void initContainers(ConfigurableEnvironment environment) {
        eurekaServerContainer.start();
    }
}
