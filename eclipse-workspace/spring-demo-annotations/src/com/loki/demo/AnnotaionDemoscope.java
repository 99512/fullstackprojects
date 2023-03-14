package com.loki.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AnnotaionDemoscope {

	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.properties.xml");
		
		Coutch thecoutch=context.getBean("tenniceCoutch", Coutch.class);
		Coutch alphacoutch=context.getBean("tenniceCoutch", Coutch.class);
		
		boolean result=(thecoutch==alphacoutch);
		System.out.println("\nthis is lokesh is champion and he is good on this point: "+result);
		System.out.println(thecoutch);
		System.out.println(alphacoutch);
		context.close();
	}
}
