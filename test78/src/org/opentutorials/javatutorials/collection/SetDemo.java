package org.opentutorials.javatutorials.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> A = new HashSet<Integer>(); // Collection 인터페이스를 구현하고 있는 HashSet 클래스
		A.add(1); //add 자체가 데이터 타입이 object  
		A.add(2);
		A.add(3);

		Iterator hi = A.iterator();

		while (hi.hasNext()) { // 집합에 값이 있다면 true 라면 아래 실행
			System.out.println(hi.next()); // 하나하나씩 출력해라 출력이되면 삭제해라 . hi담긴 값
		}

	}

}
