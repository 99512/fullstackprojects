package codewithlokesh;

public class trackcoutch implements Mycoutch {

	
	private Fortuneservices fortuneservices;
	
	public trackcoutch(Fortuneservices fortuneservices) {
		super();
		this.fortuneservices = fortuneservices;
	}

	public trackcoutch() {
		
	}
	@Override
	public String getworouts() {
		
		return "You want to run up to five rounds";
	}

	@Override
	public String getdayFortunes() {
		
		return fortuneservices.getFortune();
	}
	
	public void dostartup() {
		System.out.println("this is start up method ");
	}
}
