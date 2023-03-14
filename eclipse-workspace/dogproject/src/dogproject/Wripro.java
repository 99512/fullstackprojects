package dogproject;

import java.util.Scanner;

public class Wripro {

	private String id,name,job;
	
	private int sal;
	
	private static int totalsal;
	
	public void getdetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id ,name,job,sal");
		id=sc.next();
		name=sc.next();
		job=sc.next();
		sal=sc.nextInt();
		totalsal=sal+totalsal;
	}
	public void putdatails() {
		System.out.println("id="+id);
		System.out.println("id="+name);
		System.out.println("id="+sal);
		System.out.println("id="+job);
		System.out.println("totalsal="+totalsal);
	}
	
	public  static void display() {
		System.out.println("totalsal="+totalsal);
	}
	
	public static void main (String args[]) {
		Wripro wripro=new Wripro();
		wripro.getdetails();
		wripro.putdatails();
		Wripro wripro1=new Wripro();
		wripro1.getdetails();
		wripro1.putdatails();
		Wripro.display();
	}
	
	
	
}
