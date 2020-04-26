package com.cragon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RefreshScope
public class TestController {
    @Value("${message:null}")
    private String message;
    @Value("${ext1:null}")
    private String ext1;
    @Value("${ext2:null}")
    private String ext2;

    @GetMapping("message")
    public String getMessage() {
        return this.message;
    }

    @GetMapping("multi")
    public String getMulti() {
        return String.format("ext1: %s ext2: %s", ext1, ext2);
    }
}
