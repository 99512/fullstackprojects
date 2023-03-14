package string;

import java.util.Scanner;

public class Clear {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter string: ");
		str=sc.nextLine();
		System.out.println("old Stirng is: "+str);
		System.out.println("new String is:"+remove(str));
	}
	
	public static String remove(String str) {
		
	String newString="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newString.indexOf(ch)==-1) {
				newString+=ch;
			}
		}
		return newString;
	}

}
