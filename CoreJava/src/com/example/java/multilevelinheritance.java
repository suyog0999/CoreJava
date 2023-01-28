package com.example.java;

public class multilevelinheritance {

	public static void main(String[] args) {
		Father Bhausaheb=new Father("Vithoba","Rahane","Suyog");
		Bhausaheb.displayName();

	}

}
class Grandfather{
	String gfirstName;
	String lastName;
	public Grandfather(String gfn, String ln) {
		this.gfirstName=gfn;
		this.lastName=ln;
		
		
	}
	public void displayName(){
		System.out.println(this.gfirstName + this.lastName);
	}
}

class Father extends Grandfather{
	String ffirstName;
	public Father(String gfn, String ln,String ffn) {
		super(gfn,ln);
		this.ffirstName=ffn;
	}
}