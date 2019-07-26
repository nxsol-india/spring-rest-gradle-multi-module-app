package com.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebserviceApplication {
	 /**
     * Used when run as JAR
     */    
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

	
    /**
     * Used when run as WAR
     */
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebserviceApplication.class);
    }
}
