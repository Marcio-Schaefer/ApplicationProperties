package com.example.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DatabaseConfig1 {

	@Autowired
	private Environment env;

	@Bean
	public void databaseConnection1() {
		System.out.println("I'm connecting to the database " + env.getProperty("database")
				+ " with password " + env.getProperty("password"));
	}
}