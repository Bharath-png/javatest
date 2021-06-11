package com.javabasics;

public class Palindromeinteger {
	public static void ispalindromenumber(int num) {
		int sum=0;
		int reminder;
		int original;
		original =num;
		while(num>0) {
			reminder=num%10;
			num=num/10;
			sum=(sum*10)+reminder;
		}
		if(original==sum){
			System.out.println("is palindrome number");	
		}
		else {
			System.out.println("is not polindrome number");
		}
	}
	public static void main(String[] args) {
		ispalindromenumber(151);
		ispalindromenumber(1441);
		ispalindromenumber(101);
		ispalindromenumber(100);
		ispalindromenumber(1222);

	}

}
