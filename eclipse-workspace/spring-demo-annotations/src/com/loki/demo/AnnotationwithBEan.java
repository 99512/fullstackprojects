package com.loki.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationwithBEan {

	public static void main(String[] args) {
		
		
		//read spring configure file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Autoconfi.class);
		
		
		//get bean form the spring container
		Coutch thecoutch=context.getBean("swimCoutch", Coutch.class);
		
		
		//call a method on the bean
		System.out.println(thecoutch.getdailyworkout());
		
		System.out.println(thecoutch.getdailyFortunes());
		
		//close the context
		context.close();

	}

}
