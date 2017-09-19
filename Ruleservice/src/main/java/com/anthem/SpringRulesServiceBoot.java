/**
 * 
 */
package com.anthem;

import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * The main class, which Spring Boot uses to bootstrap the application.
 * 
 */
@SpringBootApplication
public class SpringRulesServiceBoot {

	private static Logger log = LoggerFactory.getLogger(SpringRulesServiceBoot.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringRulesServiceBoot.class, args);

		/*
		 * String[] beanNames = ctx.getBeanDefinitionNames();
		 * Arrays.sort(beanNames);
		 * 
		 * StringBuilder sb = new StringBuilder("Application beans:\n"); for
		 * (String beanName : beanNames) { sb.append(beanName + "\n"); }
		 * log.info(sb.toString());
		 */
	}

	/**
	 * By defining the {@link KieContainer} as a bean here, we ensure that
	 * Drools will hunt out the kmodule.xml and rules on application startup.
	 * Those can be found in <code>src/main/resources</code>.
	 * 
	 * @return The {@link KieContainer}.
	 */

	@Bean
	public Module jodaTimeModule() {
		return new JodaModule();
	}

}
