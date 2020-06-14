package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {
	public static void main(String[] args) {
		//Set 같은 경우 중복되는 데이터는 제거가 되면서 저장이 된다 . 순서 X
		Set<StudentEx2> set = new HashSet<StudentEx2>();
		set.add(new StudentEx2(1, "홍길동"));
		set.add(new StudentEx2(2, "박재호"));
		set.add(new StudentEx2(1, "조민우"));
		Iterator<StudentEx2> iterator = set.iterator();

		while (iterator.hasNext()) {
			StudentEx2 student = iterator.next();
			System.out.println(student.StudentNum + " : " + student.name);
		}
		
		Set<String> set2 = new HashSet<String>();
		set2.add("재호");
		set2.add("재호");
		for (String value : set2) {
			System.out.println(value);
		}
	}
}
