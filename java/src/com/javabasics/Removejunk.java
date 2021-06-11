package com.javabasics;

public class Removejunk {

	public static void main(String[] args) {
			
			String str ="@@#@#@#@# Jagadndfdssdf ";
			
			//Regular experession : [^a-zA-Z0-9]
			
			str = str.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(str);
		}

	}
