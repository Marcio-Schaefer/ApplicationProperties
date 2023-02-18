package com.example.configurations.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ApplicationProperties {

	@Getter
	@Component
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public final static class Database {
		@Value("${database}")
		private String database;
		@Value("${password}")
		private int password;
	}
	
	@Getter
	@Component
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public final static class Messaging {
		@Value("${host}")
		private String host;
		@Value("${port}")
		private Long port;
	}

	@Getter
	@Component
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public final static class Generic {
		@Value("${genericVariable}")
		private int genericVariable;
	}
}