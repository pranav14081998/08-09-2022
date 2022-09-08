package com.decisions1.bll;

import java.util.Scanner;

public class TestCountDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CountDigits c1 = new CountDigits();
		
		System.out.println("Enter positive number");
		int num=sc.nextInt();
		System.out.println("Number of digit is :"+c1.countDigits(num));
	sc.close();

}

	}


