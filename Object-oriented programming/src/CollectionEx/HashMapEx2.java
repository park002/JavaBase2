package CollectionEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> hashMap = new HashMap<Student, Integer>();
		hashMap.put(new Student(1, "ȫ�浿"), 95);
		hashMap.put(new Student(1, "ȫ�浿"), 95); // �й��� �̸��� ����
		System.out.println("�� Entry �� :" + hashMap.size());
	}
}
