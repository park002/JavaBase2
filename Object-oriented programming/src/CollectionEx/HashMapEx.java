package CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("����", 85);
		map.put("�ڹڹ�", 90);
		map.put("������", 80);
		map.put("�ڹڹ�", 95); // "�ڹڹ�" Ű�� ���� ������ ���� �������� ������ ������ ��ü�Ѵ�.
		System.out.println("�� Entry �� : " + map.size());

		// ��üã��
		System.out.println("\t �ڹڹ� : " + map.get("�ڹڹ�"));
		System.out.println();

		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); // �ݺ��ڸ� ��´�.
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		// ��ü ����
		map.remove("�ڹڹ�");
		System.out.println("�� Entry �� : " + map.size());

		// ���2) ��ü�� �ϳ��� ó��
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
