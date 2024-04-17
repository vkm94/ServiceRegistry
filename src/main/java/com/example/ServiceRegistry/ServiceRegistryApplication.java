package com.example.ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
