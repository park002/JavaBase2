package CollectionEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("Happy", 32)); //100����
		set.add(new Member("Happy", 32)); //200����
		System.out.println("�� ��ü �� :" + set.size());
		// �ߺ��Ǵ� �����ʹ� ���Ű� �Ǹ鼭 �����̵Ǹ鼭 ����x

	}
}
