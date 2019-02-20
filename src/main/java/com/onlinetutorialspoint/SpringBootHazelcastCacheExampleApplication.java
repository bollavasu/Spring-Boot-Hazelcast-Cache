package com.onlinetutorialspoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootHazelcastCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHazelcastCacheExampleApplication.class, args);
	}
}
