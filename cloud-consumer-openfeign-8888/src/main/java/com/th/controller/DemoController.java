package com.th.controller;

import com.th.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/getPort")
    public String getPort() {
        return demoService.getServerPort();
    }

    @GetMapping("/timeOut")
    public String timeOut() {
        return demoService.timeOut();
    }
}
