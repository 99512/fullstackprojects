package com.loki.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {

	public static void main(String[] args) {
		
		
		//read spring configure file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.properties.xml");
		
		
		//get bean form the spring container
		Coutch thecoutch=context.getBean("tenniceCoutch", Coutch.class);
		
		
		//call a method on the bean
		System.out.println(thecoutch.getdailyworkout());
		
		System.out.println(thecoutch.getdailyFortunes());
		
		//close the context
		context.close();

	}

}
