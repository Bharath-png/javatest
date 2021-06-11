package com.javabasics;

public class Reversestring {

	public static void main(String[] args) {
		String str="bharath";
		int length = str.length();
		String reverse="";
		for(int i=length-1; i>=0; i--) {	
		reverse=reverse+str.charAt(i);
	}
System.out.println(reverse);

	StringBuffer sf = new StringBuffer(reverse);
	System.out.println(sf.reverse());
}}