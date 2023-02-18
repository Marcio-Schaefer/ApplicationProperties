package com.example.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.configurations.properties.ApplicationProperties;

@Configuration
public class DatabaseConfig3 {

	@Autowired
	private ApplicationProperties.Database properties;

	@Bean
	public void databaseConnection3() {
		System.out.println("I'm connecting to the database " + properties.getDatabase()
				+ " with password " + properties.getPassword());
	}
}