package CollectionEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("Happy", 32)); //100번지
		set.add(new Member("Happy", 32)); //200번지
		System.out.println("총 객체 수 :" + set.size());
		// 중복되는 데이터는 제거가 되면서 저장이되면서 순서x

	}
}
