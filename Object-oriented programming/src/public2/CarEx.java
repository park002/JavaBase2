package public2;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			
			int funckTireNumber = car.run();
			switch (funckTireNumber) {
			case 1:
				System.out.println(car.frontleftTire.location + " 금호 타이어 로 교체");
				car.frontleftTire = new KumhoTire("금호 타이어", 10);
				break;
			case 2:
				System.out.println(car.frontRightTire.location + " 현대 타이어 로 교체");
				car.frontRightTire = new KumhoTire("현대 타이어", 10);
				break;
			case 3:
				System.out.println(car.backleftTire.location + " 금호 타이어 로 교체");
				car.backleftTire = new KumhoTire("금호 타이어", 10);
				break;
			case 4:
				System.out.println(car.backRightTire.location + " 현대 타이어 로 교체");
				car.backRightTire = new KumhoTire("현대 타이어", 10);
				break;
			}
		}
	}
}
