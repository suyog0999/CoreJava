package com.example.java;

public class polymorphism {

	public static void main(String[] args) {
		Addition a= new Addition();
		a.addtion(12, 13);             //o/p--> 12+13=25
		a.addtion(12, 13 ,14);         //o/p--> 12+13+14=39
		a.addtion(12, 13 ,14,15);      //o/p--> 12+13+14+15=54
		
		
		AdditionB b= new AdditionB();
		b.addtion(12, 13);             //o/p--> 12+13=25
		b.addtion(12, 13 ,14);         //o/p--> 12+13+14=39
		b.addtion(12, 13 ,14,15);      //o/p--> hello  overriding
		

	}

}


// polymorphism
//overloading - same class , same methoName , different signature
// overriding -different class  , same methoName  , same signature
class Addition {
	
	public  void addtion(int x , int y) {
		System.out.println(x+y);
	}
	
	public  void addtion(int x ,int y ,int z) {
		System.out.println(x+y+z);
	}
	
	public  void addtion(int x , int y , int z , int k) {
		System.out.println(x+y+z+k);
	}
}

class AdditionB extends Addition {
	
	public  void addtion(int x , int y , int z , int k) {
		System.out.println("hello");
	}
	
}