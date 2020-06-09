package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DB");
		list.add("IBATIS"); // 4
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		System.out.println();
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		list.remove(2); // DB»èÁ¦
		list.remove(2);// Servlet/JSP »èÁ¦
		list.remove("IBATIS");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		for (String str : list) {
			System.out.println(str);
		}

	}
}
