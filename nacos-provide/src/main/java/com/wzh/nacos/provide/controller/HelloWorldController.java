package com.wzh.nacos.provide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {
    @Value("${nacos.config}")
    private String config;

    @GetMapping("/helloNacos")
    public String helloNacos() throws Exception {
//        throw new Exception();
//        Thread.sleep(60000L);
        return "helloNacos";

    }

    @GetMapping("/getValue")
    public String getValue() {
        return config;
    }
}
