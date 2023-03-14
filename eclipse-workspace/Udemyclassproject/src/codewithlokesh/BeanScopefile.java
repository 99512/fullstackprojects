package codewithlokesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopefile {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.applicationContext2.xml");
		
		Mycoutch thecoutch=context.getBean("mycoutch", Mycoutch.class);
		Mycoutch alphacoutch=context.getBean("mycoutch", Mycoutch.class);
		
		boolean result=(thecoutch==alphacoutch);
		System.out.println("\nthis is lokesh is champion and he is good on this point: "+result);
		System.out.println(thecoutch);
		System.out.println(alphacoutch);
		context.close();
	}

}
