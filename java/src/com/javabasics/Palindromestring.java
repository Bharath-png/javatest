package com.javabasics;

public class Palindromestring {

	public static void ispalindromestring(String str) {
		int length= str.length();
		String reverse="";
		for(int i=length-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		if(reverse.contains(str)) {
			System.out.println("is polindrome string");
		}
		else {
			System.out.println("is not polindrome string");
		}
		
	}
	
    public static void main(String[] args) {
   
		ispalindromestring("malayalam");
		ispalindromestring("ust");
		ispalindromestring("Bharathgm");

		StringBuilder buider = new StringBuilder("Bharathgm");
		
		System.out.println(buider.reverse());
    }
   
}
