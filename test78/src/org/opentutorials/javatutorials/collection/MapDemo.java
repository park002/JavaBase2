package org.opentutorials.javatutorials.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

	static void iteratorUsingForEach(HashMap map) { // 클래스메소드 // HashMap a
		// java map api라고 구글에 검색해보시고, method instance 부분을 보면 Set<Map.Entry<K,V>>
		// entrySet() 메소드 있다.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	// 결론적으로, Map의 Key-value값들이 entry()를 통해 하나의 객체로 만들어지고, 그 객체가 하나의 Set집합에 하나의 원소로
	// 들어가게 됩니다.
//여기서 Set은 Collection을 상속받았기에 iterator을 쓸 수 있게 되는 것입니다.
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while (i.hasNext()) { // 현재 레코드의 존재유무
			Map.Entry<String, Integer> entry = i.next(); // next()값이 있으면 출력후 삭제 하라
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}

	}

}
