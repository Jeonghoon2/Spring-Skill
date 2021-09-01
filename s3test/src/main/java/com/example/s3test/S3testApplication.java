package com.example.s3test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class S3testApplication {

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
		+ "classpath:application.properties,"
		+ "classpath:aws.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(S3testApplication.class)
			.properties(APPLICATION_LOCATIONS)
			.run(args);
	}

}
