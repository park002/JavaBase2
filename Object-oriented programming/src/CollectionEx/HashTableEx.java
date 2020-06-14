package CollectionEx;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		Set<String> set = new HashSet<String>();
		set.add(null);
		Iterator<String> iterator = set.iterator();
		if (iterator.hasNext()) {
			String abc = iterator.next();
			System.out.println(abc);
		}
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵�");
			String id = sc.nextLine();
			System.out.print("��й�ȣ");
			String password = sc.nextLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ� ID�Դϴ�.");
			}
		}
	}
}
