package com.dayfivebasicprograms;

import java.util.Scanner;

public class Poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter the N value :");
		int n=scanner.nextInt();
			for (i=1;i<=n ;i++) {
				double power = Math.pow(2, i);
				System.out.println("power values is " +power);
				
			}
	}

}
