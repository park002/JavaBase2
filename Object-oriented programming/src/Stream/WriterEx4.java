package Stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Teee/test10.txt");
		String str = "ABC";
		writer.write(str);
		
		writer.flush();
		writer.close();
		
		
		
	}
}
