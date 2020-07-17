package Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Teee/test3.db");
		byte[] arrays = { 10, 20, 30, 40, 50 };
		os.write(arrays, 1, 3);
		os.flush();
		os.close();

	}

}
