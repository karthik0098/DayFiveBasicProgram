package com.dayfivebasicprograms;

import java.util.Scanner;

public class Vowelsorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		System.out.println("enter the character to check is vowel or consonants");
		char c = sc.next().charAt(0);  
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("it is a vowel");
		}
		else
			System.out.println("it is a consonant");
		

	}

}
