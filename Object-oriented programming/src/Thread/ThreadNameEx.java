package Thread;

public class ThreadNameEx {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());

		ThreadA threadA = new ThreadA();

		threadA.start();

		ThreadB threadB = new ThreadB();

		threadB.start();
	}
}
