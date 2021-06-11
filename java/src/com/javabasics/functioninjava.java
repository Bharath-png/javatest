package com.javabasics;

public class functioninjava {

	public static void main(String[] args) {
		
		functioninjava obj = new functioninjava();
	// one object will be created, obj is the reference variable, refering to this object
	// after creating the object, the copy of all non static methods will be given to this object	
		obj.test();
	
		int i =obj.pqr();
		System.out.println(i);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.divison(30, 10);
		System.out.println(div);
		}
	//non static method
	public void test() {   //no input, no output
		System.out.println("test method");
	}
       //void means does not return any value
	public int pqr() {     //no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;	
	}
	public String qa() {   //no input, some output
		System.out.println("qa method");
		String s = "selenium";
		return s;			
	}
	public int divison(int x, int y) {    // x and y input values and int is the return value
		System.out.println("divison method");
		int d= x/y;
		return d;	
	}
	
	
	
	
	
	
	
	
	
}
