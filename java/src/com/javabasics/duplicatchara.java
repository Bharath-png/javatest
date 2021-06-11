package com.javabasics;

import java.util.HashMap;
import java.util.Map;

public class duplicatchara {

	public static void main(String[] args) {
		
		tofindduplicatechar("abbbbbbccccdefghi");

	}
public static void tofindduplicatechar(String inputstring) {
	char stringarray[]= inputstring.toCharArray();
	HashMap<Character, Integer>charcountmap=new HashMap<Character,Integer>();
	for(char c:stringarray) {
		if(charcountmap.containsKey(c)) {
			charcountmap.put(c, charcountmap.get(c)+1);
		}
		else {
			charcountmap.put(c, 1);
		}
	}
	for(Map.Entry entry:charcountmap.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}}}
