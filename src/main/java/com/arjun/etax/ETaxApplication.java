package com.arjun.etax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ETaxApplication {
	public static void main(String[] args) {
		SpringApplication.run(ETaxApplication.class, args);
	}

}
