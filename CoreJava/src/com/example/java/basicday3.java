package com.example.java;

public class basicday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		// counting of vowels
		
		String nameE = "Suyog";
		//String vowels = "aeiou";
		int count = 0;
		for(int i = 0 ; i < nameE.length() ; i++) {
			if(nameE.charAt(i) == 'a' || nameE.charAt(i) == 'e'||nameE.charAt(i) == 'i' ||nameE.charAt(i) == 'o'|| nameE.charAt(i) == 'u') {
				count = count + 1;
			}
			
		}
		System.out.println(count);   // o/p--> 2
		
		//==============================================================================================================
		
		
		String h = "Javascript";
		String j = h.substring(1,5); // end value is not included
		String jq = h.substring(2); 
		System.out.println(j);  // avas
		System.out.println(jq); // vascript
		

	}

}
