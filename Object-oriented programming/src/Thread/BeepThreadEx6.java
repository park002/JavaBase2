package Thread;

import java.awt.Toolkit;

public class BeepThreadEx6 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			// 익명 자식객체
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
		thread.start(); // 작업스레드 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
