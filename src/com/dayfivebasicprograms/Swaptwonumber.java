package com.dayfivebasicprograms;

import java.util.Scanner;

public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the two numbers two be swap");
		System.out.println("enter the first number a=");
		int a=scan.nextInt();
		System.out.println("enter the second number b=");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap the value of a is: " +a);
		System.out.println("after swap the value of b is: " +b);
	}

}
