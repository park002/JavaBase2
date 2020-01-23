package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";

		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		
		}
		System.out.println("====================");
		
		ArrayList <String>al = new ArrayList  <String>(); // 참조형데이터 ,래퍼런스
		al.add("one");
		al.add("two");
		al.add("three");
		for (int i = 0; i < al.size(); i++) {
			String value= al.get(i);
			System.out.println(value);

		}
	}

}
