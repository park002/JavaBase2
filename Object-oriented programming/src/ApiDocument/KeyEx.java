package ApiDocument;

import java.util.HashMap;

public class KeyEx {
	public static void main(String[] args) {
		// key객체를 식별키로 사용해서 String값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");

		// 식별키 new Key(1)로 "홍길동" 을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
