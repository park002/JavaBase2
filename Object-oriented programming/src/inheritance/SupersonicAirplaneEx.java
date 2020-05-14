package inheritance;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sp = new SupersonicAirplane();
		sp.takeOff();
		sp.fly(); // 일반비행합니다
		sp.flyMode = sp.SUPERSONIC;
		sp.fly(); // 초음속 비행을 시작합니다
		sp.flyMode = sp.NORMAL;
		sp.fly();
		sp.land();

	}

}
