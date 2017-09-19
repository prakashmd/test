/**
 * 
 */
package com.anthem.tat.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * @author AF43847
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringBootWebRestServices {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRestServices.class, args);
	}

	@Bean
	public Module jodaTimeModule() {
		return new JodaModule();
	}
}
