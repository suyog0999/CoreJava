package com.example.java;

public class day3 {

	public static void main(String[] args) {
		// hard coded means without constructor
		Person suyog=new Person();
		System.out.println(suyog.firstName);
		System.out.println(suyog.lastName);
		suyog.displayName();
		
		
		// with constructor
		PersonA mayur = new PersonA("mayur","rahane");
		mayur.displayName();
	
		PersonA mrunmayi = new PersonA("mrunmayi","deshmukh");
		mrunmayi.displayName();
		
		
		// set/get method
		
		PersonB amit = new PersonB();
		amit.setFirstName("amit");
		amit.setLastName("nehe");
		amit.displayName();
		

	}

}

// hard coded means without constructor

class Person {

String firstName = "Suyog";
String lastName = "Rahane";

public void displayName() {
	System.out.println(this.firstName + this.lastName);
}
}

// with constructor

class PersonA {
String firstName;
String lastName ;

public PersonA(String fn , String ln) {
	this.firstName = fn;
	this.lastName = ln;				
}
public void displayName() {
	System.out.println(this.firstName + this.lastName);
}
	
}

// set/get method

class PersonB {

	String firstName;
	String lastName;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}
