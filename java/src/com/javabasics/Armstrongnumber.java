package com.javabasics;

public class Armstrongnumber {
	public static void isarmstrongnumber(int num) {
		int cube = 0;
		int original;
		int reminder;
		original=num;
		while (num>0){
			reminder= num%10;
			num=num/10;
			cube=cube+(reminder*reminder*reminder);
			
		}
		if(original==cube) {
			System.out.println("given number is armstrong");
		}
		else {
			System.out.println("given number is not armsstrong");
		}
		
		
	}

	public static void main(String[] args) {
		isarmstrongnumber(153);
		isarmstrongnumber(154);
		isarmstrongnumber(0);
		isarmstrongnumber(1);

	}

}

bharath
