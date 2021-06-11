package com.javabasics;

public class wraperclasses {

	public static void main(String[] args) {
		String x= "100";
		System.out.println(x+20);
		
		//data conversion string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer,double,boolean
		String y = "12.33";
		double d = Double.parseDouble(y); //string to double
		System.out.println(d+10);
		
		//string to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(k);
		
		//int to string conversion
		int j = 200;
		System.out.println(j+20);
	    String a = String.valueOf(j);
	    System.out.println(a+20);
	    
	    String u = "100A";
	    Integer.parseInt(u);
	
		
		
		
		
		
		
	}

}
