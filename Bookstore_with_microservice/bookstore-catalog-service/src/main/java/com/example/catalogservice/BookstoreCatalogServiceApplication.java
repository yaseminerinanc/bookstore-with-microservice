package com.example.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.example")
@EnableFeignClients(basePackages = "com.example")
public class BookstoreCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreCatalogServiceApplication.class, args);
	}

}
