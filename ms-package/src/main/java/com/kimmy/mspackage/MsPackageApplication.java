package com.kimmy.mspackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsPackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPackageApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate (){
		return  new RestTemplate();
	}

}
