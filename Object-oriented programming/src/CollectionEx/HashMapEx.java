package CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("김김김", 85);
		map.put("박박박", 90);
		map.put("최최최", 80);
		map.put("박박박", 95); // "박박박" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체한다.
		System.out.println("총 Entry 수 : " + map.size());

		// 객체찾기
		System.out.println("\t 박박박 : " + map.get("박박박"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); // 반복자를 얻는다.
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		// 객체 삭제
		map.remove("박박박");
		System.out.println("총 Entry 수 : " + map.size());

		// 방법2) 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
	}
}
