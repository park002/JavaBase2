package Thread;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted())
				break;
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
