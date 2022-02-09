package com.example.billingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
@EnableFeignClients(basePackages = {"com.example"})
@EnableDiscoveryClient
public class BookstoreBillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBillingServiceApplication.class, args);
	}

}
