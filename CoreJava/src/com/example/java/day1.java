package com.example.java;

public class day1 {

	public static void main(String[] args) {
		System.out.println("hello");
		int x = 100;
		int y = 20;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		int i = 100;
		int j = 200;
//		System.out.println(i + j);
//		System.out.println(i - j);
//		System.out.println(i * j);
//		System.out.println(i / j);
//		System.out.println(i % j);

		Calculator(120, 34);
		Calculator(120, 15);
		
		Cal() ;
		Cal() ;
		Cal() ;
		Cal() ;
		
		Cal(23,45);
		Cal(233,453);
		Cal(233,453);
		Cal(2333,4533);
		
		int s = CalB(34,45);
		System.out.println(s);
		System.out.println(s+3);
		System.out.println(s-2);
		System.out.println(s-2);
		
		
		// relational operator 
		
		// < , > , <= , >= ,!= ,==
		
		System.out.println(7 != 5); // True
		System.out.println(7 == 5); // False
		System.out.println(7 >= 5); // True
		System.out.println(8 <= 9); // True
		System.out.println(8 >= 8); // True
		System.out.println(7 <= 7); // True
		System.out.println(7 > 8);  // False
		System.out.println(7 < 70); // True
		
		
		// Logical operators
		
		// AND &&
		
//		True   &&  True   ====> True
//	    False  &&  False  ====> False
//	    True   &&  False  ====> False 
//	    False  &&  True   ====> False
		
		
		System.out.println(8 == 8 && 7 ==7);
		System.out.println(8 != 8 && 7 ==7);
		System.out.println(8 == 8 && 7 !=7);
		System.out.println(8 != 8 && 7 !=7);
		
		// OR ||
		
//		True   ||  True   ====> True
//	    False  ||  False  ====> False
//	    True   ||  False  ====> True 
//	    False  ||  True   ====> True
		
		
		System.out.println(8 == 8 || 7 ==7);
		System.out.println(8 != 8 || 7 ==7);
		System.out.println(8 == 8 || 7 !=7);
		System.out.println(8 != 8 || 7 !=7);
		
	
		// NOT !	
		// True -- False
		// False -- True
		
		System.out.println(!(7 != 7));
		System.out.println(!(7 == 7));
		
		
		// conditional statements
		
		
		// input and multiple output
		
		int numT = -2;
//		if(numT > 0 && numT <= 5) {
//			System.out.println("10 percent discount");
//		}
//		if(numT > 5 && numT <= 10) {
//			System.out.println("20 percent discount");
//		}
//		if(numT > 30) {
//			System.out.println("30 percent discount");
//		}
		
		
		if (numT > 0 && numT <= 5) {
			System.out.println("10 percent discount");
		}
		else if (numT > 5 && numT <= 10) {
			System.out.println("20 percent discount");
		}
		else if (numT > 30) {
			System.out.println("30 percent discount");
		}
		else {
			System.out.println("Invalid ticketss");
		}
		
		
		int marks = 92;
		
//	if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks > 75) {
//			System.out.println("Grade B");
//		}
//		if(marks > 60) {
//			System.out.println("Grade C");
//		}
//		
//		
//		if (marks > 90) {
//			System.out.println("Grade A");
//		}
//		else if (marks > 75) {
//			System.out.println("Grade B");
//		}
//		else if (marks > 60) {
//			System.out.println("Grade C");
//		}
//	

		
		int a = 10;
		int b = 50 ;
//		
//		if(a > b) {
//			System.out.println("a is greater");
//		}
//		else {
//			System.out.println("b is greater");
//		}
		
		String aaa  = a > b ? "a is greater":"b is greater";
		System.out.println(aaa);
		
		
		// Loops 
//			
//		for(initialization ; conditionCheck ; incrementDecrement) {
//				//statements 
//		}
		
		
		for(int ia = 0 ; ia <= 5 ; ia++) {
			System.out.println("hello");
		}
		
		for(int k = 1 ; k <= 5 ; k++) { // 2 // 3 // 4 // 5 // 6
			System.out.println(k); // 1 // 2 // 3 // 4 // 5
		}
		
		for(int p = 5 ; p >= 0 ; p--) {
			System.out.println(p);
		}
		
		for(int q = 2 ; q <= 20 ; q = q + 2) {
			System.out.println(q);
		}
		
		for(int l = 1 ; l <= 10 ; l++) { // 2 // 3 / 4 // 5
			if(l == 5) {
				break;
			}
			System.out.println(l); // 1 // 2 // 3 // 4
		}
		
		
		for(int m = 1 ; m <= 10 ; m++) { //2 // 3 // 4 // 5
			System.out.println(m); //1 // 2 // 3 // 4 // 5
			if(m == 5) {
				break;
			}
			
		
	}

}
	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

//function without parameter and function without return type

	public static void Cal() {
		System.out.println(8 + 9);
	}

	// function with parameter and function without return type

	public static void Cal(int x , int y) {
		System.out.println(x+y);
	}

	// function with parameter and function with return type
	
	public static int CalB(int x , int y) {
		System.out.println(x+y);
		return x + y ;
	}


}
