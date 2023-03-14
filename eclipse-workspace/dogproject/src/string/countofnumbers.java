package string;

import java.util.Scanner;

public class countofnumbers {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,l,j=0,u=0,sl=0,d=0;
		char ch;
		String name;
		System.out.println("enter message : ");
		name=sc.nextLine();
		l=name.length();
		for(i=0;i<l;i++) {
			ch=name.charAt(i);
			if(ch>='a' && ch<='z') {
				j++;
			}
			else if(ch>='A' && ch<='Z') {
				u++;
			}
			else if(ch>='0' && ch<='9') {
			   d++;
			}
			else {
				sl++;
			}
			
		}
		
		System.out.println("Number of lower case letters :"+j);
		System.out.println("Number of uppper case letters :"+u);
		System.out.println("Number of digits  :"+d);
		System.out.println("Number of spcial  cahrecore :"+sl);
		
		
	}

}
