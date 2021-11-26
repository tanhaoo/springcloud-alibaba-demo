package com.th.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
@Service
public interface DemoService {

    @GetMapping("/getPort")
    String getServerPort();

    @GetMapping("/timeOut")
    String timeOut();
}
