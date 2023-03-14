package interfacee;

public class Cone extends Circle implements Demo{
	
	
	private int h;
	private double area;
	public void accept() {
		super.accept();
		System.out.println("enter n");
		h=sc.nextInt();
		
	}

	public void display() {
		super.dispalay();
		area=pi*r*r*h;
	}
	public static void main(String args[]) {
		Circle c1=new Circle();
		Cone c2=new Cone();
		c1.accept();
		c1.dispalay();
		c2.accept();
		c2.dispalay();
	}
}
