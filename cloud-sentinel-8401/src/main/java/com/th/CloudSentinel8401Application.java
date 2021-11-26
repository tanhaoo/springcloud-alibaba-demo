package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class CloudSentinel8401Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudSentinel8401Application.class, args);
	}

}
