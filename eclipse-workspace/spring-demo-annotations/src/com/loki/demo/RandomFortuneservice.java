package com.loki.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneservice implements FortuneService {

	
	private String[] data= {
		"loki is good by and he not  champion",
			"loki is not a champion and he is good part of sign",
		"finally he is so beautiful "
	};
	
	private Random myrandom=new Random();
	@Override
	public String getFortunes() {
		int index=myrandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
