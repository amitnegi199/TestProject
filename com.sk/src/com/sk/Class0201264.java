package com.sk;

import java.util.Scanner;

public class Class0201264 
{
public static void main(String[] args)
{
	int length , breadth , area;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Value for length");
	length = sc.nextInt();
	System.out.println("Enter Value for breadth");
	

	breadth = sc.nextInt();
	
	area = length * breadth;
	
	System.out.println("Area of Rectangle=" + area);
	

}
}
