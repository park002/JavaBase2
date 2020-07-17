package Stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Teee/test9.txt");
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();

	}
}
