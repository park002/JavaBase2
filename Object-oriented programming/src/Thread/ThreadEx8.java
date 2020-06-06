package Thread;

public class ThreadEx8 {
	public static void main(String[] args) {
		Thread thread = new MovieThread2(); // 자동 형변환
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		thread.interrupt();

	}
}
