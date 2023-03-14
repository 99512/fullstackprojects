package string;

import java.util.Scanner;

public class Duplecatekeys {
	
	public static void main (String args[]) {
		String message;
		int count;
		int demo=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Message: ");
		message=sc.nextLine();
		char ch[]=message.toCharArray();
		System.out.println("duplicate characters in a given string");
		for(int i=0;i<ch.length;i++) {
		   count = demo;
		   for(int j=i+1;j<ch.length;j++) {
			   if(ch[i]==ch[j]) {
				   count++;
				   ch[j]='0';
			   }
			   
		   }
		   if(count>1&&ch[i]!='0')
			   System.out.println(ch[i]+"  and count is: "+count);
		}
	}

}
