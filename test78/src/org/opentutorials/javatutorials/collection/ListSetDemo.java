package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		// Iterator는 interface
		Iterator hi = (Iterator) A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
