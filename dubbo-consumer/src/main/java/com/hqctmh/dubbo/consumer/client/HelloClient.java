package com.hqctmh.dubbo.consumer.client;

import com.hqctmh.dubbo.service.HelloService;

public class HelloClient {
    public static void main(String[] args) {
        HelloService helloService = null;
        String msg = helloService.sayHello("hello");
        System.out.println(msg);
    }
}
