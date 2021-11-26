package com.th.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getPort")
    public String getServerPort() {
        return serverPort;
    }

    @GetMapping("/timeOut")
    public String timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return "success";
    }
}
