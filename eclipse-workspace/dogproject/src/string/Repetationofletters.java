package string;

import java.util.Scanner;

public class Repetationofletters {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int i=0,l,j;
		char ch=0;
		String name;
		System.out.println("enter name: ");{
			name=sc.nextLine();
			l=name.length();
			
			for(j=0;j<l;j++) {
				ch=name.charAt(j);
				if(ch==(char)j|| ch==(char)(j+32));
				System.out.println(ch+"="+(int)ch);	
			
		}
			
			
		}
	}

}
