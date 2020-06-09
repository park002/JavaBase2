package CollectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		// 중복되는 데이터는 제거가 되면서 저장 순서(X)
		Set<String> set = new HashSet<String>();
		set.add("Java"); // Java는 한 번만 저장됨
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		int size = set.size();
		System.out.println("총 객체 수 :" + size);
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
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
		set.clear(); // 모든 객체를 제거하고 비움
		if (set.isEmpty())
			System.out.println("비어있다면");
	}
}
