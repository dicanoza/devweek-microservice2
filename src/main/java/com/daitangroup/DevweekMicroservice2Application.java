package com.daitangroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DevweekMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(DevweekMicroservice2Application.class, args);
	}
}
