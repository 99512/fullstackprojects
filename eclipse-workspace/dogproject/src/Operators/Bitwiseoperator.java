package Operators;

import java.util.Scanner;

public class Bitwiseoperator {
	 
		public static void main(String args[]){  

			Scanner sc=new Scanner(System.in);
			int a,b,c,bigger=0;
			System.out.println("enter a,b,c");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(a>b && a>c) {
				bigger=a;
			}
			if(b>a && b>c) {
				bigger=b;
			}
			if(c>a && c>b) {
				bigger=c;
			}
		System.out.println("Biggest numbers of three numbers are :" +bigger);
		
		if(a==b && b==c && c==a) {
			System.out.println("equilateral Triangle");
		}
		if(a!=b || b!=c || c!=a) {
			System.out.println("triangle is isosceles");
		}
		
		}
		
		

}
