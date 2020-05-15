package Polymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�� ����  HanKookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 15);
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������", 16);
				break;
			case 3:
				System.out.println("�� ����  HanKookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 15);
				break;
			case 4:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� w������", 16);
				break;
			}
			System.out.println("==================");

		}
	}
}
