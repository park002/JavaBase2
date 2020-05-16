package public2;

public class Car {
	// 필드의 다형성
	Tire frontleftTire = new Tire("앞 왼쪽 바퀴", 5);
	Tire frontRightTire = new Tire("앞 오른쪽 바퀴", 5);
	Tire backleftTire = new Tire("뒤 왼쪽 바퀴", 5);
	Tire backRightTire = new Tire("뒤 오른쪽 바퀴", 2);

	// 생성자
	// 메소드

	public int run() { // 출발
		System.out.println("차가 출발 합니다");
		if (frontleftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backleftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0; // 아무것도 펑크난게 없고 정상작동이면 return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다");
	}
}
