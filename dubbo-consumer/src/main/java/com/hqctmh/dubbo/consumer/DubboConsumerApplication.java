package com.hqctmh.dubbo.consumer;

import com.hqctmh.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class DubboConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);

		HelloService producerService = context.getBean("producerService", HelloService.class);
		String hello = producerService.sayHello("hello");
		System.out.println(hello);

	}

}
