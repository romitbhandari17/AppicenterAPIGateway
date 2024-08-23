package com.appicenter.demo.AppicenterAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppicenterApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppicenterApiGatewayApplication.class, args);
	}

}
