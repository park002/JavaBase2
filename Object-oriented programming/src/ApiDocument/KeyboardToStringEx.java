package ApiDocument;

import java.io.IOException;

public class KeyboardToStringEx {
	public static void main(String[] args) {
		byte[] bytes = new byte[100]; // ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		System.out.print("�Է�:");

		try {
			int readByteNo = System.in.read(bytes); // �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
			String str = new String(bytes, 0, readByteNo - 2); // �迭�� ���ڿ��� ��ȯ
			System.out.println(str);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
