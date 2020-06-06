package Thread;

public class AutoSaveThread extends Thread { // 작업스레드
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000); // 일시정지.
			} catch (InterruptedException e) {
				// TODO: handle exception
				break;
			}
			save();
		}
	}
}
