package interfacee;

import java.util.Scanner;

public class Circle implements Demo {

	protected int r;
	protected double area;
	
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void accept() {
		System.out.println(" enter r");
	r=sc.nextInt();
	
	
	}

	@Override
	public void dispalay() {
		area=pi*r*r;
		System.out.println("area of circel is ="+ area);
		
	}

}
