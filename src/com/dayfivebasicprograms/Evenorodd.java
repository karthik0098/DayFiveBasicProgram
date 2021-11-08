package com.dayfivebasicprograms;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the value ");
		int a=scan.nextInt();
		if (a%2==0) {
			System.out.println("it is a even number ");	
		}else
			System.out.println("it is not a even number");
	
	
	}
}
