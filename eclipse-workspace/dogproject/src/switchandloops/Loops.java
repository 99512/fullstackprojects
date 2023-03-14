package switchandloops;

import java.util.Scanner;

public class Loops {
	public static void main(String args[]) {
		int rno,i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	System.out.println("select 1 for For loop ");
	System.out.println("enter 2 for for While loop");
	System.out.println("enter 3 for Do While loop");
	
	
	
	rno=sc.nextInt();
	
	switch(rno) {
	case 1:
		System.out.println("enter n");
	n=sc.nextInt();
	for(i=0;i<=n;i++) {
		System.out.println("this is For Loop"+i);
	}
	break;
	case 2:
		System.out.println("enter n");
		n=sc.nextInt();
		i=0;
		while (i<=n) {
			System.out.println("this is While loop"+i);
		i++;
		}
		
	break;
	case 3:
		System.out.println("enter n");
		n=sc.nextInt();
		i=0;
		do {
			System.out.println("This is do While loop"+i);
			i++;
		}while(i<=n);
	break;
	
		
	default:
		
		System.out.println("invalid number: ");
	}
}
}
