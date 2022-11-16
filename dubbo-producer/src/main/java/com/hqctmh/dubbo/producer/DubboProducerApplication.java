package com.hqctmh.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class DubboProducerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboProducerApplication.class, args);
        new CountDownLatch(1).await();
    }

}
