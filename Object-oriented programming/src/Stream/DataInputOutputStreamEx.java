package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Teee/primitive.db"); // ����Ʈ��� ��� ��Ʈ��
		DataOutputStream dos = new DataOutputStream(fos); // ������Ʈ��
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.30);
		dos.writeInt(2);
		dos.flush();
		dos.close();
		FileInputStream fis = new FileInputStream("C:/Teee/primitive.db"); // ����Ʈ��� �Է� ��Ʈ��
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
