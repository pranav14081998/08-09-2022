package com.decisions1.bll;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNum= sc.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNum= sc.nextInt();
		
		if(firstNum<secondNum) { 
			System.out.println("Your  first number is smaller than second number. ");
			for(int i=firstNum;i<=secondNum;i++){
				if(i%2==0)  
			 
			{
				System.out.println("Even Number are "+i);
				sumEven+=i;
			}
			}
		
			System.out.println("Sum of Even Numbers are :"+sumEven);
			
			for(int i=firstNum;i<=secondNum;i++){
				if(i%2==1)
			
					{ 
					System.out.println("Odd Number are "+i);
					sumOdd+=i;
				}
		}
			System.out.println("Sum of Odd Numbers are :"+sumOdd);
		}
		
		}
		
	}

	
		
		
		
			

	


