package com.lowes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
		System.out.println("Spring Cloud Gateway started...");
	}

}
