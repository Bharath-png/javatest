package com.javabasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
import com.sun.javafx.collections.MappingChange.Map;

public class Duplicateelements {

	/*public static void main(String[] args) {
		String names[] = { "Java", "Ruby", "Java", "Ruby", "Python" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is ::" + names[i]);
				}
			}}}
}*/

	 /* public static void main(String[] args) {
		Set<String> store = new HashSet<String>();
		String names[] = { "Java", "Ruby", "Java", "Jquery", "Python" };
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate elementis from HashSEt  : " + name);

	}}}}
*/
	/*public static void main(String[] args) {
		String names[] = { "Java", "Ruby", "Java", "Jquery", "Python" };
		HashMap<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
             for (java.util.Map.Entry<String, Integer> entrySet : storeMap.entrySet()) {
				if (entrySet.getValue() > 1) {
					System.out.println("Duplicate values from MAP :" + entrySet.getKey());
				}}}}}*/
	public static void main(String[] args) {
		findduplicateelements("java ruby java ruby ruby java");
		
	}
public static void findduplicateelements(String inputstring) {
	String words[]=inputstring.split(" ");
	HashMap<String, Integer>wordcount =new HashMap<String, Integer>();
	for(String word:words) {
		if(wordcount.containsKey(word)) {
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}
		else {
			wordcount.put(word, 1);
		}
	}
	Set<String>wordsinstring = wordcount.keySet();
	for(String word: wordsinstring) {
		if(wordcount.get(word)>1) {
			System.out.println(word + " : "+wordcount.get(word));
		}}}}










