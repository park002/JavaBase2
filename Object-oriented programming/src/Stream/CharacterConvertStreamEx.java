package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {
	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����Ѵ�.");
		String data = read();
		System.out.println(data);
	}

	static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/test1.txt"); // ����Ʈ ��� �����
		Writer writer = new OutputStreamWriter(fos); // ���ڱ�� �������
		writer.write(str); // �Ű������� �־��� ���� ���� ������.
		writer.flush();
		writer.close();
	}

	static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Teee/test1.txt"); // ����Ʈ��� �Է���
		Reader reader = new InputStreamReader(fis); // ���ڱ�� �Է�����
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); // char �迭���� ���� ����ŭ ���ڿ��� ��ȯ.
		return data;
	}
}
