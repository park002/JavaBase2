package Thread;

public class ThreadB extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");

		}
	}
}
