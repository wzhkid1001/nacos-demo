package com.wzh.nacos.consumer.controller;

import com.wzh.nacos.consumer.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 通过RestTemplate+Ribbon的方式进行服务调用
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RemoteClient remoteClient;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/consumer")
    public String test1() {
        return restTemplate.getForObject("http://nacos-provide/helloNacos", String.class);
    }

    @GetMapping("/feign")
    public String test() {
        return remoteClient.helloNacos();
    }


}
