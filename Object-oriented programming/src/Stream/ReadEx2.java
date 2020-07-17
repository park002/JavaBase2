package Stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Teee/test2.db"); // 자동형변환
		byte[] buffer = new byte[100];
		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum == -1)
				break;
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			
		}
		is.close();
	}
}
