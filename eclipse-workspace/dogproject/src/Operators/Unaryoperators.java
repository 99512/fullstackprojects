package Operators;

public class Unaryoperators {	
public static void main(String args[]) {
	
	int a=10;
    

	System.out.println(++a);
    System.out.println(a--);
	System.out.println(a--);
	
	System.out.println("****************************");
	int b=10;
	int c=10;
	System.out.println(b++ + ++b); 	
	System.out.println(c++ + c++);
	
	System.out.println("****************************");
	
	int e=10;
	int f=-10;
	 boolean  g=true;
	 boolean h=false;
	System.out.println(~e);
    System.out.println(~f);
    System.out.println(!g);
    System.out.println(!h);
}

}
