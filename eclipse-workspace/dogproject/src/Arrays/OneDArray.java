package Arrays;

import java.util.Scanner;

public class OneDArray {
		public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		int i,n,a[],b[],c[];
		System.out.println("Enter n");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		System.out.println("Enter elements of a");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter elements of b");
		for(i=0;i<n;i++) {
			b[i]=sc.nextInt();
			
		}
		for(i=0;i<n;i++) {
			c[i]=a[i]+b[i];
			
		}
		
		System.out.println("Additions of two arrays are ");
		for(i=0;i<n;i++) {
			System.out.println(c[i]);
			
		}
	}

}
