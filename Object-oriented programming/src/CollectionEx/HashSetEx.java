package CollectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		// �ߺ��Ǵ� �����ʹ� ���Ű� �Ǹ鼭 ���� ����(X)
		Set<String> set = new HashSet<String>();
		set.add("Java"); // Java�� �� ���� �����
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		System.out.println("�� ��ü �� :" + size);
		Iterator<String> iterator = set.iterator(); // �ݺ��� ���
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println();

		for (String str : set) {
			System.out.println("\t" + str);
		}
		set.clear(); // ��� ��ü�� �����ϰ� ���
		if (set.isEmpty())
			System.out.println("����ִٸ�");
	}
}
