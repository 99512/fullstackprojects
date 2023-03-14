package com.loki.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoutch implements Coutch {

	
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoutch(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getdailyworkout() {
		
		return "you can work is this is good boy adn also champion";
	}

	@Override
	public String getdailyFortunes() {
		
		return fortuneService.getFortunes();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
