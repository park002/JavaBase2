package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.net.URLDecoder;

public class ReadLineEx {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader(URLDecoder.decode(ReadLineEx.class.getResource("language.txt").getPath(), "UTF-8")); // 문자 기반 입력스트림 얻기'
		BufferedReader br = new BufferedReader(reader); // 보조스트림연결
		while (true) {
			String data = br.readLine();
			if (data == null)
				break;
			System.out.println(data);
		}
		br.close();
	}
}
