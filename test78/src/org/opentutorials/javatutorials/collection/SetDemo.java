package org.opentutorials.javatutorials.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);

		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);

		//System.out.println(A.containsAll(B)); // A가 B를 포함하고 있는가 ?
		//System.out.println(A.containsAll(C));// A가 C를 포함하고 있는가 ?
		//System.out.println(A.addAll(B)); // B의모든것을 추가한다 A에다
		
        //A + B  합집합
        //A.addAll(B);
		//A.addAll(B); // B의모든것을 추가한다 A에다
		
        //A와 B의 교집합
      //A.retainAll(B);
	   // A.retainAll(B); //A에도 있고 B에도 있는 원소 
	    
	    
        //A - B 차집합  A에서 B를 뺀 차집
        //A.removeAll(B);
     
     
         
		// Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화 하였는데 그 중 하나가
		// Iterator이다.
		Iterator hi = (Iterator) A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}

	}

}
