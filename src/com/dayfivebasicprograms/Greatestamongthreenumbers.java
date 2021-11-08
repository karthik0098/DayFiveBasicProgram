package com.dayfivebasicprograms;

import java.util.Scanner;

public class Greatestamongthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the three numbers ");
		System.out.println("enter the first number :");
		int a=scan.nextInt();
		System.out.println("enter the second number :");
		int b=scan.nextInt();
		System.out.println("enter the third number :");
		int c=scan.nextInt();
		if (a>b) {
			if(a>c) {
				System.out.println("a is the greatest number :" +a);
			}else
				System.out.println("c is the greatest number :" +c);	
		}
		 else if (b>c)
			System.out.println("b is the greatest number :" +b);
			else
				System.out.println("c is the greatest number :" +c);

	}

}
