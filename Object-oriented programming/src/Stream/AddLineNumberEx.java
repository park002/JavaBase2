package Stream;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberEx {
	public static void main(String[] args) throws Exception {
		String filePath = "src/Stream/AddLineNumberEx.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		int rowNumber = 0;
		String rowData;
		while ((rowData = br.readLine()) != null) { // null �� �ƴҰ�� true null�ϰ�� false
			System.out.println(++rowNumber + ": " + rowData);
		}
		br.close();
	}
}
