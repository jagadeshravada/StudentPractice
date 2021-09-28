package org.boot.config;

import java.time.LocalDateTime;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ConfigJavaApi {
	
	@Bean //default bean name will be method name
	public LocalDateTime getTime() {
		System.out.println("pre-defined bean");
		return LocalDateTime.now();
			
	}

}
