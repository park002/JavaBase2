package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {
	public static void main(String[] args) {
		//Set ���� ��� �ߺ��Ǵ� �����ʹ� ���Ű� �Ǹ鼭 ������ �ȴ� . ���� X
		Set<StudentEx2> set = new HashSet<StudentEx2>();
		set.add(new StudentEx2(1, "ȫ�浿"));
		set.add(new StudentEx2(2, "����ȣ"));
		set.add(new StudentEx2(1, "���ο�"));
		Iterator<StudentEx2> iterator = set.iterator();

		while (iterator.hasNext()) {
			StudentEx2 student = iterator.next();
			System.out.println(student.StudentNum + " : " + student.name);
		}
		
		Set<String> set2 = new HashSet<String>();
		set2.add("��ȣ");
		set2.add("��ȣ");
		for (String value : set2) {
			System.out.println(value);
		}
	}
}
