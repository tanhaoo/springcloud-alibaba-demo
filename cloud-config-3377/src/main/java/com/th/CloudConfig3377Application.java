package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfig3377Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfig3377Application.class, args);
	}

}
