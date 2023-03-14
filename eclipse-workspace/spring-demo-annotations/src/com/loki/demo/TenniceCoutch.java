package com.loki.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@Scope("prototype")
public class TenniceCoutch implements Coutch {

	
	@Autowired
	@Qualifier("randomFortuneservice")
	private FortuneService fortuneService;
	
	
	//  this is construction Injection
	/*
	 * @Autowired 
	 * public TenniceCoutch(FortuneService fortuneService) {
	 * 
	 * this.fortuneService = fortuneService; }
	 */

//this is setter injection
	/*
	 * @Autowired 
	 * public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("you are in defoult setFortuneService");
	 * this.fortuneService = fortuneService; }
	 */
	//this is method injection
	/*
	 * @Autowired 
	 * public void dosomethingstuff(FortuneService fortuneService) {
	 * System.out.println("you are in defoult dosomethingstuff");
	 * this.fortuneService = fortuneService; }
	 */
	
	
	@Override
	public String getdailyworkout() {
		
		return "pracitce your back end part";
	}
	
	public TenniceCoutch() {
		System.out.println("you are in defoult constrouter");
	}


	@Override
	public String getdailyFortunes() {
		return fortuneService.getFortunes();
	}

}
