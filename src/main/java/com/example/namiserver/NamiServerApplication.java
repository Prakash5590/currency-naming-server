package com.example.namiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamiServerApplication.class, args);
	}

}
