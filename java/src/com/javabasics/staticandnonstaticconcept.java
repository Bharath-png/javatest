package com.javabasics;

public class staticandnonstaticconcept {
	String name = "tom"; //non static value
	static int age = 25;  //static value

	public static void main(String[] args) {
		sum();
		System.out.println(age);
		System.out.println(staticandnonstaticconcept.age);
		//the above examples are for static method and we can call values directly
		
		staticandnonstaticconcept obj = new staticandnonstaticconcept();
		/*String s = obj.name;*/
		System.out.println(obj.name);
		obj.sendmail();
		
		
	}
public void sendmail() {
	System.out.println("sendmail method");// non static value
}
public static void sum() {
	System.out.println("sum method"); //static value
}
}
