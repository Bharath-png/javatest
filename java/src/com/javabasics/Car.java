package com.javabasics;

public class Car {
	int mod; bharath
	int wheel;
	
//int mod and int wheel are the classes
public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		//new car is the object and object name is a, a refering the new car
		System.out.println("before assigning the refrences");
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println(a.mod);
		
		System.out.println("after assigning the refrences");
		//shifting of object refrences from one object to another object
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		
	}

}
