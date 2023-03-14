package com.loki.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServece implements FortuneService{

	@Override
	public String getFortunes() {
		
		return "Hii this is fortune serviece and he is so happy";
	}

}
