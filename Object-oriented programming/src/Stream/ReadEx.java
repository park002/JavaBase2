package Stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Teee/test1.db");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		is.close();
	}

}
