package com.scannerClass;

import java.util.Scanner;

public class ReadIntValue {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);   // create scanner object
		
		System.out.println(" Enter your age ");
		
		int userAge = obj.nextInt();    //read user input
		
		System.out.println(" my age is " + userAge);
	}

}
