package com.fortuneteller.tellerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FtTellerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtTellerServiceApplication.class, args);
	}

}

