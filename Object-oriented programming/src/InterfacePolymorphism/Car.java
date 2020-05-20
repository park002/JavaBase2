package InterfacePolymorphism;

public class Car {
	// 필드의 다형성
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {
		
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

}
