package com.javabasics;

public class SmallestLargest {

	public static void main(String[] args) {
		int numbers[]= {20,10,-2,45,100,2,6};
		int smallest= numbers[0];
		int largest= numbers[0];
		for(int i=0; i<numbers.length; i++) {
        if(numbers[i]>largest) {
	    largest=numbers[i];
       }else if (numbers[i]<smallest){
    	   smallest=numbers[i];
       }
	}
System.out.println("smallest number is: "+smallest);
System.out.println("largest number is: "+largest);
}
}