package codewithlokesh;

public class Baseballcoutch implements Mycoutch {
	
private Fortuneservices fortuneservices;


public Baseballcoutch(Fortuneservices fortuneservices) {
	this.fortuneservices=fortuneservices;
}

@Override
public String getworouts() {
	
	return "prctice lot of thisng every day ";
}

@Override
public String getdayFortunes() {
	
	return "Lets do it"+fortuneservices.getFortune();
}

	

}
