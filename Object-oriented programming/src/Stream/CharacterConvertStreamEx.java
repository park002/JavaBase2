package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용한다.");
		String data = read();
		System.out.println(data);
	}

	static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/test1.txt"); // 바이트 기반 출력을
		Writer writer = new OutputStreamWriter(fos); // 문자기반 출력으로
		writer.write(str); // 매개값으로 주어진 문자 열을 보낸다.
		writer.flush();
		writer.close();
	}

	static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Teee/test1.txt"); // 바이트기반 입력을
		Reader reader = new InputStreamReader(fis); // 문자기반 입력으로
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); // char 배열에서 읽은 수만큼 문자열로 변환.
		return data;
	}
}
