package Thread;

public class MusicRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("������ ����մϴ�");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}