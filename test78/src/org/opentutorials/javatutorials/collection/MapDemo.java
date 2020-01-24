package org.opentutorials.javatutorials.collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4); 
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
	}

}
