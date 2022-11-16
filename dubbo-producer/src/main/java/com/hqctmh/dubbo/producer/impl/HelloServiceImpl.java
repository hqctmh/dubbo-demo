package com.hqctmh.dubbo.producer.impl;

import com.hqctmh.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
