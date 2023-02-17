package com.example.java;
import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num []= new int[5];
     int[] num2= new int[5];
     num[0] = 99;
		num[1]= 100;
		num[2] = 101;
		num[3] = 102;
		num[4]=  105;

		//System.out.println(num);
		//System.out.println(Array);
		String q55 = Arrays.toString(num);
		System.out.println(q55);//o/p--> [99, 100, 101, 102, 105]
     
	}

}
