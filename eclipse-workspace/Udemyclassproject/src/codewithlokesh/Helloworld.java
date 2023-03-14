package codewithlokesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Helloworld {

	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext loki=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		
		Mycoutch theCoutch=loki.getBean("mycoutch", Mycoutch.class);
		
		System.out.println(theCoutch.getworouts());
		
		System.out.println(theCoutch.getdayFortunes());
		loki.close();

	}

}
