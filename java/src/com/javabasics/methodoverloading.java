package com.javabasics;

public class methodoverloading {

	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();
		obj.sum();
		obj.sum(30);
		obj.sum(30, 10);
	}
     //you can not create a method inside a method
	//we can overload main method
	//duplicate methods i.e same method name with same number of arguments are not allowed
	public void sum() {
	System.out.println("sum method---zero param");
}
public void sum(int  i) {
	System.out.println("sum method---1 input param");
	System.out.println(i);
}
public void sum(int k, int l ) {
	System.out.println("sum method---2 input param");
	System.out.println(k+l);
}
	
	
	
}