package com.javabasics;

public class twodimentionalarray {

	public static void main(String[] args) {
		
		String x[][]= new String[3][5];
		System.out.println(x.length);  //total no of rows
		System.out.println(x[0].length); //total no of colms
		
		x[0][1] = "A";
		x[0][2] = "B";
		x[0][3] = "C";
		x[0][4] = "D";
		
		System.out.println(x[0][3]);
		
		//print all the values of 2d array
		for(int row=0; row<x.length; row++) {
			for (int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		
		
		
		
		

	}

}
