package polymorphim;



public class CompailTimePolimorphim {
	
	public void add(int a,int b) {
		System.out.println("Addition of two number = "+ (a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of three number= "+ (a+b+c));
		
	}

	public void add(int a,int b,int c,int d) {
		System.out.println("Addition of four number= "+ (a+b+c+d));
		
	}
	public void add(int a,int b,String c,int d) {
		System.out.println("Addition of string with number= "+ (a+b+c+d));
		
	}
	public void add(double a,int b,int c,int d) {
		System.out.println("Addition of double with number = "+ (a+b+c+d));
		
	}
	public void add(String a,double b,int c,int d) {
		System.out.println("Addition of String ,double , number= "+ (a+b+c+d));
		
	}
	public static void main(String args[]) {
		CompailTimePolimorphim c1=new CompailTimePolimorphim();
		c1.add(1, 2);
		c1.add(1, 2, 3);
		c1.add(1, 2, 3, 4);
		c1.add(21.2, 33, 33, 44);
		c1.add(12, 232, "lokiis ", 3);
		c1.add("naveen", 32.23, 43, 2);
	}

}
