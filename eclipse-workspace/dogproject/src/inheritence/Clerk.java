package inheritence;

import java.util.Scanner;

public class Clerk {
	
	protected String name,id;
	protected int sal;
	Scanner sc=new Scanner(System.in);
	public void accept() {
      System.out.println("Enter name,id,salary");
      name=sc.next();
      id=sc.next();
      sal=sc.nextInt();
      
	}
	public void display() {
		System.out.println(" name="+name);
		
		System.out.println("Id"+id);
		
		System.out.println("salary="+sal);
	}
	

}
