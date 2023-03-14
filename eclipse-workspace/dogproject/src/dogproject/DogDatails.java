package dogproject;

import java.util.Scanner;

public class DogDatails {
	
	protected String name,breed;
	protected int age;
	
	Scanner sc=new Scanner(System.in);
	
	public DogDatails(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void accept() {
		System.out.println("enter Dog name: ");
		name=sc.nextLine();
		System.out.println("enter Dog breed: ");
		breed=sc.nextLine();
		System.out.println("enter dog age: ");
		age=sc.nextInt();
		
	}
	public void dispaly() {
		System.out.println("Dog name is:"+name);
		System.out.println("Dog breed is:"+breed);
		System.out.println("Dog age is :"+age);
	}
	public String  toString() {
		return ("dog name is= "+  name +" and dog breead is= "+  breed +" and Age is ="+  age);
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
	


