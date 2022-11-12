package com.thehecklers.planefinder2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Planefinder2Application {

	public static void main(String[] args) {
		SpringApplication.run(Planefinder2Application.class, args);
	}

	@Bean
	WebClient.Builder builder() {
		return WebClient.builder();
	}
}
