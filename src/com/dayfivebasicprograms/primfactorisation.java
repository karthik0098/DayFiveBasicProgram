package com.dayfivebasicprograms;

import java.util.Scanner;
public class primfactorisation {
	public static void main(String[] args) {
		int i,count=0;
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		for (i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("its is a prime number");
			}
			else
				System.out.println("its not a prime number");
		
	}
}
