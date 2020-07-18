package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferdVsBufferExample {
	public static void main(String[] args) {
		try {
			String originalFilePath1 = NonBufferdVsBufferExample.class.getResource("originalFile1.jpg").getPath();
			String targetFilePath1 = "C:/Teee/targetFile1.jpg";
			FileInputStream fis = new FileInputStream(originalFilePath1); // ����Ʈ ��� �Է� ��Ʈ��
			FileOutputStream fos = new FileOutputStream(targetFilePath1); // ����Ʈ��� ��� ��Ʈ��
			/////////////////////////////////////////
			String originalFilePath2 = NonBufferdVsBufferExample.class.getResource("originalFile2.jpg").getPath();
			String targetFilePath2 = "C:/Teee/targetFile2.jpg";
			FileInputStream fis2 = new FileInputStream(originalFilePath2); // ����Ʈ��� �Է½�Ʈ��
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2); // ����Ʈ��� ��½�Ʈ��.
			BufferedInputStream bis = new BufferedInputStream(fis2); // ���� ���� ��Ʈ�� ����
			BufferedOutputStream bos = new BufferedOutputStream(fos2); // ���� ���� ��Ʈ�� ����.
			long nonBufferTime = copy(fis, fos); // ���ۺ�����Ʈ�� ���� ������ ��� (x)
			System.out.println("���۸� ������� �ʾ��� ��� : \t" + nonBufferTime + "ns");
			long BufferTime = copy(bis, bos);
			System.out.println("���۸� ������� ��� : \t" + BufferTime + "ns");
			fis.close();
			fos.close();
			bis.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int data = -1;

	static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // ���۽ð� ����
		while (true) { // ����Ʈ �а�
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush(); // ����Ʈ ���
		long end = System.nanoTime(); // ���ð� ����
		return end - start;
	}
}
