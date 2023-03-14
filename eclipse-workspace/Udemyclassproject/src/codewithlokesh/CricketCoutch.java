package codewithlokesh;

public class CricketCoutch implements Mycoutch {

	
	private Fortuneservices fortuneservices;
	
	
	private String email;
	private String team;
	
	public CricketCoutch(){
		System.out.println("hey u are in cricketCoutch");
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("hey u are in gettterementond   setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("hey u are in gettterementond   setTeam");
		this.team = team;
	}

	public void setFortuneservices(Fortuneservices fortuneservices) {
		System.out.println("hey u are in gettterementond   cricketCoutch");
		this.fortuneservices = fortuneservices;
	}



	@Override
	public String getworouts() {
		
		return "this is my life dont distrube meee";
	}

	@Override
	public String getdayFortunes() {
		
		return fortuneservices.getFortune();
	}

}
