package InterfacePolymorphism;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 자동형변환
		vehicle.run(); // 오버라이딩 된 버스가 달립니다 호출 될 것임
	
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare(); // 승차요금을 체크합니다.
	
	}
}
