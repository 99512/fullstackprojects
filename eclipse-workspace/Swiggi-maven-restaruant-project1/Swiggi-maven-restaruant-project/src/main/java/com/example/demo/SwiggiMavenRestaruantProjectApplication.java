package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SwiggiMavenRestaruantProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggiMavenRestaruantProjectApplication.class, args);
		System.out.println("this is my project");
	}
}

		