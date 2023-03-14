package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class FullStackProjectApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(FullStackProjectApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
	this.userRepository.save(new User( "loki","kondasani","loki@gmail.com"));
	this.userRepository.save(new User( "PAVAN","Purra","pavan@gmail.com"));
	this.userRepository.save(new User( "naveen","lion","naveen@gmail.com"));	
	}
}
