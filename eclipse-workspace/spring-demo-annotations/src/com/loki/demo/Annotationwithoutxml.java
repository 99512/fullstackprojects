package com.loki.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotationwithoutxml {

	public static void main(String[] args) {
		
		
		//read spring configure file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Autoconfi.class);
		
		
		//get bean form the spring container
		SwimCoutch thecoutch=context.getBean("swimCoutch", SwimCoutch.class);
		
		
		//call a method on the bean
		System.out.println(thecoutch.getdailyworkout());
		
		System.out.println(thecoutch.getdailyFortunes());
				
				System.out.println(thecoutch.getEmail());
				System.out.println(thecoutch.getTeam());
		
		//close the context
		context.close();

	}

}
