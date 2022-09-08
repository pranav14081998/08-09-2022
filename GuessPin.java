package com.decisions1.bll;

import java.util.Scanner;

public class GuessPin {
	
	public static final int pin=54321;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		while(true)
		{
			
			System.out.println("Enter the PIN: " );
			int guess=scanner.nextInt();
			
			if(pin==guess) 
			{ 
				System.out.println("Correct, Welcome Back.");
			
				break;
			}
			
			else
			{
				if(num<2) 
				{
				System.out.println("Incorrect, try again.");
				}
			
			
			}
			num++;
			
			if(num>=3)
			{		
			System.out.println("Sorry but you have been locked out.");
			break;	
			}
			
		}
			
		scanner.close();
			
		}
		
		
		
			
		}
	


		
		



