package com.th.controller;

import com.oracle.tools.packager.Log;
import com.th.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FlowLimitController {

    @Autowired
    private TestService testService;

    @GetMapping("/testA")
    public String testA() {
        //暂停0.8秒
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "-----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName()+": testB");
        return "-----testB";
    }

    @GetMapping("/testC")
    public String testC() {
        return testService.common();
    }

    @GetMapping("/testD")
    public String testD() {
        return testService.common();
    }
}
