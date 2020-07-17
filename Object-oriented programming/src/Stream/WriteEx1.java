package Stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Teee/test7.txt");
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
	}

}
