package inheritence;

public class Ceo extends Manager {
	
	private int exp;
	public void input() {
		get();
		System.out.println("enter Experience");
		exp=sc.nextInt();
	}
	public void output() {
		put();
		System.out.println("Experience="+exp);
	}
	public static void main(String args[]) {

		Clerk c1=new Clerk();
		c1.accept();
		c1.display();
		Manager m1=new Manager();
		m1.get();
		m1.put();
		Ceo c3=new Ceo();
		c3.input();
		c3.output();
		
	}

}
