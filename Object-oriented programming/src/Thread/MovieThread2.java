package Thread;

public class MovieThread2 extends Thread {
	// 작업 스레드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("동영상을 재생합니다");
			if (this.isInterrupted()) {
				break;
			}
		}
	}
}
