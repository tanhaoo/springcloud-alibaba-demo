package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacos9001Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudNacos9001Application.class, args);
	}

}
