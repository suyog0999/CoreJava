package com.example.java;

public class day2 {

	public static void main(String[] args) {
		

				// loops

				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);

				// for ---- definite numbers
				// while loop

//				for(initialization ; conditionCheck ; increment/decrement){
//					// statements
//				}

				// print - 1 to 5

				for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6
					System.out.println(i); // 1 //2 // 3 // 4 // 5
				}

				// print 5 - 1
				for (int i = 5; i >= 1; i--) { // 4 // 3 //2 //1 // 0
					System.out.println(i);// 5 // 4 //3 // 2 //1
				}

				// Table of 2

				for (int i = 2; i <= 20; i = i + 2) { // 4 --------------22
					System.out.println(i); // 2 // 4--------- 20
				}

				// Table 2 reverse
				for (int i = 20; i >= 2; i = i - 2) {
					System.out.println(i);
				}
				
				// break with for
				
				for(int i = 1 ; i <= 5 ; i++) { //2
					System.out.println(i); // 1 // 2
					if(i == 2) {
						break; 
					}
				}
				
				for(int i = 5 ; i >= 1 ; i--) {  // 4 // 3 // 2
					System.out.println(i);  // 5 // 4 // 3 // 2
					if(i == 2) { 
						break; 
					}
				}
				
				for(int i = 5 ; i >= 1 ; i--) {   // 4 // 3 // 2
					if(i == 2) { 
						break; 
					}
					System.out.println(i);  // 5 // 4 //3
				}
				
				for(int i = 1 ; i<=3  ; i++) { //2 //3 // 4
					if(i == 2) {
						continue;
					}
					System.out.println(i); //1 // 3
				}
				
				
				//initialization..
				// while(condition){
				
					// statements 
					// increment/ decrement
				//}
				
				
				// While
			
				int t1 = 1;
				while(t1 <= 5) {
					System.out.println("hello");
					t1 ++;
				}
				
				int t2 = 5;
				while(t2 >= 1) {
					System.out.println(t2);
					t2 --;
				}
				
				int t3 = 5;
				while(t3 >= 1) {
					System.out.println("hello");
					t3 --;
				}
				
//				int t4 = 5;
//				while(t4 >= 1) {
//					if(t4 == 2) {
//						break;
//					}
//					System.out.println("hello");
//					t4 --;
//				}
					
				
				int t4 = 5;
				while(t4 >= 1) {
					System.out.println(t4); // 5 // 4 // 3 // 2
					if(t4 == 2) {
						break;
					}
				
					t4 --; // 4 // 3 // 2
				}
					
				
				int t5 = 5;
				while(t5 >= 1) {
					if(t5 == 2) {
						t5 --; //1
						continue;
					}
					System.out.println(t5);  //5 // 4 // 3 // 1
					t5 --;  // 4 // 3 // 2 // 0
				}
					
					
						
					
				
				
				
				
				
				
				
				

			}

		

		


	}


