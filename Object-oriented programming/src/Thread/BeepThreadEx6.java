package Thread;

import java.awt.Toolkit;

public class BeepThreadEx6 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			// �͸� �ڽİ�ü
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};

		};
		thread.start(); // �۾������� ����
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
