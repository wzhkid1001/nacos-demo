package com.wzh.nacos.consumer;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时";
    }
}
