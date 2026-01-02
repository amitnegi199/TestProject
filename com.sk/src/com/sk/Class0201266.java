package com.sk;

import java.util.Scanner;

public class Class0201266 {

	public static void main(String[] args) 
	{
		int principal , time;
		float rate , interest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value for principal");
		principal = sc.nextInt();
		System.out.println("Enter Value for time");
		time = sc.nextInt();
		System.out.println("Enter Value for rate");
		rate = sc.nextFloat();
		interest = (principal * rate * time) / 100;
		
		System.out.println("interest=" + interest);
		

	}
	}


