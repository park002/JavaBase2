package ApiDocument;

import java.util.HashMap;

public class KeyEx {
	public static void main(String[] args) {
		// key��ü�� �ĺ�Ű�� ����ؼ� String���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "ȫ�浿");

		// �ĺ�Ű new Key(1)�� "ȫ�浿" �� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
