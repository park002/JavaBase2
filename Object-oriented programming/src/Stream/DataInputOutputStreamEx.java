package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/primitive.db"); // 바이트기반 출력 스트림
		DataOutputStream dos = new DataOutputStream(fos); // 보조스트림
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("감자바");
		dos.writeDouble(90.30);
		dos.writeInt(2);
		dos.flush();
		dos.close();
		FileInputStream fis = new FileInputStream("C:/Teee/primitive.db"); // 바이트기반 입력 스트림
		DataInputStream dis = new DataInputStream(fis);

		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" + order);
		}
		dis.close();
	}
}
