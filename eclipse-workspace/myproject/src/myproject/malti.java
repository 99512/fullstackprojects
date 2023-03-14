package myproject;

import java.util.Scanner;

public class malti {
	public static void main(String Args) {
		Scanner Sc=new Scanner(System.in) ;
		int i,n,mal=0;
		System.out.println("enter n");
		n=Sc.nextInt();
		for(i=0;i<=n;i++) {
			mal=n*i;
		}
		System.out.println("mal="+mal);
	}
 
}
