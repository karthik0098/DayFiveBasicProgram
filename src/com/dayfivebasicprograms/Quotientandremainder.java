package com.dayfivebasicprograms;

import java.util.Scanner;

public class Quotientandremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number :");
		int n=scan.nextInt();
		double a,b;
		int i;
			a=(n%3);
			b=(n/3);
			System.out.println("divide by 3 the remainder is :" +a);
			System.out.println("divide by 3 the quotient is :" +b);

	}

}
