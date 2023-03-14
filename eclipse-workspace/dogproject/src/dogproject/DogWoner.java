package dogproject;



public class DogWoner extends DogDatails {

	
	
	public DogWoner(String name, String breed, int age) {
		super(name, breed, age);
		
	}

	public static void main(String[] args) throws Exception {
		
		
		DogDatails dog1=new DogDatails("one","German Shepherd",15);
		DogDatails dog2=new DogDatails("two","breeeed2",15);
		DogDatails dog3=new DogDatails("three","breed3",15);
		DogDatails dog4=new DogDatails("four","German Shepherd",15);
		dog1.getBreed();
		dog2.setName("five");
		dog3.getAge();
		dog4.setBreed("skdjfskdfjsdkjf");
		
		System.out.println(dog4);
	}

}
