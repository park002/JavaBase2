package Stream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.Reader;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ");
		ps.println("�����Ͱ� ����ϴ� �� ó��");
		ps.println("�����͸� ����մϴ�.");
		ps.flush();
		ps.close();
		Reader reader = new FileReader("C:/Teee/printstream.txt");
		int n;
		while ((n = reader.read()) != -1) { // -1 �ϰ�� false
			System.out.print((char) n);
		}
	}
}
