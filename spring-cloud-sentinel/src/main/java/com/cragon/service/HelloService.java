package com.cragon.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @SentinelResource("hello")
    public String hello() {
        return "hello";
    }
}
