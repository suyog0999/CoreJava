package com.example.java;

public class basicday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String firstName = "I am learning selenium";
		System.out.println(firstName);
		//System.out.println(firstName[0]);
		
		// String +  Integer =====> String 
		// Integer + String  =====> String 
		// String  + String  =====> String 
		// Integer + Integer ====> Integer
		
		System.out.println("Hello"+2);  // "Hello2"
		System.out.println("2"+2);  // "22"
		System.out.println(4+2);  // 6
		System.out.println("5"+"66");  // 566
		
		// program 1
		
				String city  = new String("pune");
				System.out.println(city);
				
				
				
		// method(length())
		
		String firstName2 = "rohan";
		int q1 = firstName2.length();
		System.out.println(q1);//o/p--> 5
		
		// Methods
		
		// 1.concat()
		
		String firstName3 = "poorva";
		String lastName3 = "vyas";
		String  q2 = firstName3.concat(lastName3);
		System.out.println(q2);//o/p--> poorvavyas
		System.out.println(firstName3+lastName3);//o/p--> poorvavyas
			
		
		
		// 2.toUpperCase()
		
		String city2 = "Nagpur";
		String q21  = city2.toUpperCase();
		System.out.println(q21);//o/p--> NAGPUR
		
		// 3.toLowerCase()
		
		String city3 = "Wardha";
		String q22 = city3.toLowerCase();
		System.out.println(q22);//o/p--> wardha
		
		
		// Method chaining
		
		String city4 = "Jaipur";
		int aa=city4.toUpperCase().toLowerCase().length();
		System.out.println(aa);// o/p--> 6
		// "JAIPUR".toLowerCase() ====> "jaipur".length()===>6.toUpperCase()=>error
		
		// 4.equals
		
		String city5 = "pune";
		String city6 = "pune";
		String city7 = "mumbai";
		
		System.out.println(city5.equals(city7));// o/p--> false
		System.out.println(city5.equals(city6));// o/p--> true
		
		// using if else statement
		
//		if(city5.equals(city6)) {
//			System.out.println("same city");
//		}
//		else {
//			System.out.println("diffent city");
//		}
		//or
//		if(city5.equalsIgnoreCase(city6)) {
//			System.out.println("same city");
//		}
//		else {
//			System.out.println("diffent city");
//		}
		
		// using ternary operator
		String a = city5.equals(city7) ? "equal":"not equal";
		System.out.println(a);//o/p--> not equal
		
		
		// 4.startsWith()
		
		String city8 = "ujjain";
		boolean q33 = city8.startsWith("u");
		boolean q34 = city8.startsWith("Ujj");
		System.out.println(q33);//o/p--> true
		System.out.println(q34);//o/p--> false
		
		// 5.endsWith()
		
		String city9 = "delhi";
		boolean q333 = city9.endsWith("i");
		boolean q344 = city9.endsWith("hi");
		System.out.println(q333);// o/p--> true
		System.out.println(q344);//o/p--> true
		

		
		// 6.contains()
		String j = "I am learning java";
		boolean q55 = j.contains("am");
		System.out.println(q55);// o/p--> true
		
		// 7. join()
		String s="My";
		String ss="Name";
		String sss="Is";
		String ssss="Suyog";
		String S11=String.join("@",s,ss,sss,ssss);
		System.out.println(S11);// o/p--> My@Name@Is@Suyog
		
		
		// 8. indexOf()
		// 0 1 2 3 4
		// S u y o g
		String str1="Suyog";
		int a1= str1.indexOf('S');
		System.out.print(a1);//o/p-->0
		
		// 0 1 2 3 4 5 6 7 8 9 10
		// s u y o g r a h a n e
		
		String fname = "suyograhane";
		int q8 = fname.indexOf("u");//o/p--> 1
		System.out.println(q8);
		
		for(int i = 0 ; i < fname.length(); i++) {
			if(fname.charAt(i) == 'g') {
				System.out.println(i);// o/p--> 4
			}
		}
		
		
		// 9.trim()--> remove space from both side
		String Str=" pune ";
		String ab=Str.trim();
        System.out.println(ab);// o/p--> pune
        
        
        // 10.replace()
        String name="suyog";
        String AS=name.replace('u','i');
        System.out.println(AS);//o/p--> siyog
        
        
 
        // 11.isEmpty()
        
        String city0="";
        String city1="SANGAMNER";
        boolean em = city0.isEmpty();// true
		System.out.println(em);
		
		boolean em2 = city1.isEmpty();// false
		System.out.println(em2);
		
		
		
		
		
	}

}
