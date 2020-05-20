package InterfacePolymorphism;

public class Driver {

	// 매개변수의 다형성
	public void drive(Vehicle vehicle) { // 자동형변환 해줌
		vehicle.run();
		if (vehicle instanceof Bus) { // 우항의 타입으로 강제형변환이 되는가 되면 true
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			bus.run();
		}
	}
}
