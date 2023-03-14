package com.loki.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.loki.demo")

@PropertySource("classpath:sprort.properties")
public class Autoconfi {

	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean
	public  Coutch swimCoutch() {
		return new SwimCoutch(sadFortuneService());
	}
}
