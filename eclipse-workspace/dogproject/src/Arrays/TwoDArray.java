package Arrays;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	int a[][],i,n,j,sum=0,m;
	System.out.println("enter n ,m");
	n=sc.nextInt();
	m=sc.nextInt();
	a=new int[m][n];
	System.out.println("Elements in array are :");
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println(" ");
	}
	
	for(i=0;i<n;i++) {
		sum=sum+a[i][i];
	}
	System.out.println("sum Of dignals are = "+sum);
	
	}
	
}
