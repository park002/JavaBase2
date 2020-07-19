package Stream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.Reader;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("데이터를 출력합니다.");
		ps.flush();
		ps.close();
		Reader reader = new FileReader("C:/Teee/printstream.txt");
		int n;
		while ((n = reader.read()) != -1) { // -1 일경우 false
			System.out.print((char) n);
		}
	}
}
