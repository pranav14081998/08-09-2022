package com.decisions1.bll;

public class CountDigits {
	
	int n;
	int count=0;
	public int countDigits(int n) {
		if(n>=0) {
			while(n!=0) {
				n=n/10;
				count++;
			}
			
		}
		return count;
	}

	
 }


