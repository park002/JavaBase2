package Thread;

public class StopFlagEx {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		try {
			Thread.sleep(1000); // Á¤Áö
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		pt.setStop(true);
	}
}
