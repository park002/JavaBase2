package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.net.URLDecoder;

public class ReadLineEx {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader(URLDecoder.decode(ReadLineEx.class.getResource("language.txt").getPath(), "UTF-8")); // ���� ��� �Է½�Ʈ�� ���'
		BufferedReader br = new BufferedReader(reader); // ������Ʈ������
		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			System.out.println(data);
		}
		br.close();
	}
}
