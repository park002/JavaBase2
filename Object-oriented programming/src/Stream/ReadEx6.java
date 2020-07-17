package Stream;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx6 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Teee/test9.txt"); // bcd
		char[] buffer = new char[5];
		int readCharNum = reader.read(buffer, 2, 3);
		while (true) {
			if (readCharNum != -1) {
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
			break;
		}
		reader.close();
	}
}
