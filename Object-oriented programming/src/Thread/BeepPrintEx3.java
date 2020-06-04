package Thread;

import java.awt.Toolkit;

public class BeepPrintEx3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { // 익명 구현 객체
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// 작업스레드
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start(); // 작업스레드 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
