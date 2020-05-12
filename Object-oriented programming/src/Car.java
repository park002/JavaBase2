
public class Car {
	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {
		return speed;
	}

	void KeyTurnOn() {
		System.out.println("시동을 켰습니다");
	}

	void run() {
		for (int i = 1; i <= 50; i++) {
			speed = i;
			System.out.println("계속 달립니다 두둗두두 \n시속:" + speed + "km");
		}

	}
}
