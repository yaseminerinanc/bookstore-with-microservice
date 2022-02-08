package com.example.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.example.common"})
@ComponentScan(basePackages = {"com.example"})
@EnableFeignClients(value = "com.example")
@EnableEurekaClient
public class BookstoreOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreOrderServiceApplication.class, args);
	}

}
