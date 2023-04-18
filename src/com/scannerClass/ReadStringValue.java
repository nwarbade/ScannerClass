package com.scannerClass;

import java.util.Scanner;

public class ReadStringValue {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter your name");
		
		String userName = obj.nextLine();
		
		System.out.println("user name is:- " + userName);
	}

}
