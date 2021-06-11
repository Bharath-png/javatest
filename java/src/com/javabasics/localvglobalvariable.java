package com.javabasics;

public class localvglobalvariable {

	String name = "tom";
	int age = 25 ;
	
	//the above 2 are global variables or classes which apply for entire class	
	public static void main(String[] args) {
		int i=10;    //local variable which applicable only for main method and i also for this method only
		System.out.println(i);
		
		localvglobalvariable obj = new localvglobalvariable(); // to call global variables we have to call new object so we created 
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() { // i is same for this method
		int i = 10;
		int j = 20;
		
	}
}
