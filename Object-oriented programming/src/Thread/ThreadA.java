package Thread;

public class ThreadA extends Thread {
	// 상속을 받았을 경우 부모클래스에 있는 필드,메소드 사용가능
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
