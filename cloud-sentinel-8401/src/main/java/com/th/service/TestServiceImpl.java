package com.th.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    @SentinelResource("common")
    public String common() {
        return "common";
    }
}
