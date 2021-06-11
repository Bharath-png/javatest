package com.javabasics;

public class Singletontest {
		private static Singletontest singletonTest;

		public String st;

		private Singletontest() {
			st = "Jagan Reddy";

		}

		public static Singletontest getInstance() {

			if (singletonTest == null)
				singletonTest = new Singletontest();
			return singletonTest;

		}

		public static void main(String[] args) {

			Singletontest singleton = Singletontest.getInstance();
			Singletontest singleton1 = Singletontest.getInstance();
			Singletontest singleton2 = Singletontest.getInstance();

			singleton.st = (singleton.st).toUpperCase();

			System.out.println(singleton.st);

			System.out.println(singleton1.st);

			System.out.println(singleton2.st);
			
			singleton1.st = (singleton1.st).toLowerCase();
			System.out.println(singleton1.st);
			

		}

	}
