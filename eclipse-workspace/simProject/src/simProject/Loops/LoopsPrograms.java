package simProject.Loops;

import java.util.Scanner;

public class LoopsPrograms {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i=1;
		int	fact=1;
		System.out.println("enter n");
		n=sc.nextInt();
		
		while(i<=n) {
		fact=fact*i;
		System.out.println(fact);
		
			i++;
		}
		System.out.println(fact);
	}
}
