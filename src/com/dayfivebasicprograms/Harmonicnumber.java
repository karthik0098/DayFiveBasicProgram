package com.dayfivebasicprograms;

import java.util.Scanner;

public class Harmonicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i;
		double sum=0.0;
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter the harmonic limit n: ");
		int n=scanner.nextInt();
		for (i=1;i<=n;i++) {
			sum=sum+(1/i);
//			System.out.println(+i);
			System.out.println("the harmonic values is " +sum);
		}
		
	}

}
