package ApiDocument;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {
	public static void main(String[] args) {

		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length); // 인코딩

		String str1 = new String(bytes1);
		System.out.println("bytes1->String : " + str1); // 디코딩

		try {
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes2.length);

			String str2 = new String(bytes2, "UTF-8");
			System.out.println("bytes2->String : " + str2);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
