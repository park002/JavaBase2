package Stream;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx4 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Teee/test7.txt");
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.println((char) data);
		}
		reader.close();
	}
}
