package com.fortuneteller.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class FtConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtConfigServiceApplication.class, args);
	}

}

