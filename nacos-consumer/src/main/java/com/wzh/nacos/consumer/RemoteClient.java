package com.wzh.nacos.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "nacos-provide",fallback = RemoteHystrix.class)
public interface RemoteClient {
    @GetMapping("/helloNacos")
//    @RequestMapping(value="/helloNacos", method= RequestMethod.GET)
    String helloNacos();
}
