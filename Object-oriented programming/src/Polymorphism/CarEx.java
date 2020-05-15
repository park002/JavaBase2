package Polymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽  HanKookTire로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 16);
				break;
			case 3:
				System.out.println("뒤 왼쪽  HanKookTire로 교체");
				car.frontLeftTire = new HankookTire("뒤 왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("뒤 w오른쪽", 16);
				break;
			}
			System.out.println("==================");

		}
	}
}
