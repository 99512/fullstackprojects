package inheritence;

public class Manager extends Clerk {
	
	protected String qul;
	public void get() {
		accept();
		System.out.println("enter qulification");
		qul=sc.next();
	}
	public void put() {
		display();
		System.out.println("qulification= "+qul);
	}

}
