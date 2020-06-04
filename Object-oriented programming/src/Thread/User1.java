package Thread;

public class User1 extends Thread {
	private Calculator calculator; // 필드

	public void setCalculator(Calculator calculator) { // ex)100번지
		this.setName("User1"); // 스레드 이름을 User1으로 설정
		// this 라 함은 현재 클래스를 기반으로 인스턴스를 가리키는 참조.
		this.calculator = calculator;
	}

	@Override
	public void run() { // 작업스레드
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}

}
