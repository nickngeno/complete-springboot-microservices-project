package com.kimmy.mstier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsTierApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTierApplication.class, args);
	}

}
