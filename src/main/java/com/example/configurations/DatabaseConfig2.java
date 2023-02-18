package com.example.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig2 {

	@Value("${database}")
	private String database;

	@Value("${password}")
	private String password;

	@Bean
	public void databaseConnection2() {
		System.out.println("I'm connecting to the database " + database + " with password " + password);
	}
}