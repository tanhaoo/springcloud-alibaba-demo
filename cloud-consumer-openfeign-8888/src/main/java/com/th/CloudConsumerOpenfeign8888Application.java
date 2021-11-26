package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //feign启动注解
public class CloudConsumerOpenfeign8888Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOpenfeign8888Application.class, args);
    }

}
