package Thread;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator); // 공유 객체 생성
		user1.start(); // 작업스레드 user1 시작
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
