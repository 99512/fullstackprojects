package codewithlokesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setterdemoapp {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoutch thecoutch=context.getBean("cricketcoutch",CricketCoutch.class);
	
		System.out.println(thecoutch.getdayFortunes());
		System.out.println(thecoutch.getworouts());
		
		System.out.println(thecoutch.getEmail());
		System.out.println(thecoutch.getTeam());
		context.close();
	}

}
