package com.dayfivebasicprograms;

import java.util.Scanner;

public class Headortail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner (System.in);
	    System.out.println("enter the number of time to flip the coin -");
		int n=sc.nextInt();
		for (i=0;i<=n;i++) {
			double answer=Math.floor(Math.random()*2);
//			System.out.println("answer is " +answer);
			if (answer==0) {
				System.out.println("its a tail " );
			}
			else {
				System.out.println("its a head ");
			}
				
		}
		
	}

}
