package CollectionEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> hashMap = new HashMap<Student, Integer>();
		hashMap.put(new Student(1, "홍길동"), 95);
		hashMap.put(new Student(1, "홍길동"), 95); // 학번과 이름이 동일
		System.out.println("총 Entry 수 :" + hashMap.size());
	}
}
