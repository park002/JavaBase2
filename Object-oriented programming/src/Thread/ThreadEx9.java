package Thread;

public class ThreadEx9 {
	public static void main(String[] args) {
		Thread thread = new MovieThread3();
		thread.setDaemon(true);
		thread.start();
	}
}
