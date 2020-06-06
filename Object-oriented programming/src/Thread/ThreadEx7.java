package Thread;

public class ThreadEx7 {
	public static void main(String[] args) { // 메인스레드
		Thread thread1 = new MovieThread();
		thread1.start();
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}
