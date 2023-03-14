package codewithlokesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class destrymethoed {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("remove.applicationContext3.xml");
		
		Mycoutch thecoutch=context.getBean("mycoutch", Mycoutch.class);
		System.out.println(thecoutch.getworouts());
		context.close();
	}

}
