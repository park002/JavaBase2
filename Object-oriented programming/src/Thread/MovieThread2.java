package Thread;

public class MovieThread2 extends Thread {
	// �۾� ������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("�������� ����մϴ�");
			if (this.isInterrupted()) {
				break;
			}
		}
	}
}
