package Thread;

import java.awt.Toolkit;

public class BeepPrint {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ���
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ �߻�
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("��");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
