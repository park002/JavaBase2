package Thread;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator); // ���� ��ü ����
		user1.start(); // �۾������� user1 ����
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
