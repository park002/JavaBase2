package Thread;

public class ThreadEx7 {
	public static void main(String[] args) { // ���ν�����
		Thread thread1 = new MovieThread();
		thread1.start();
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}
