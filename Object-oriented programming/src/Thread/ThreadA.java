package Thread;

public class ThreadA extends Thread {
	// ����� �޾��� ��� �θ�Ŭ������ �ִ� �ʵ�,�޼ҵ� ��밡��
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
