package inheritance;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sp = new SupersonicAirplane();
		sp.takeOff();
		sp.fly(); // �Ϲݺ����մϴ�
		sp.flyMode = sp.SUPERSONIC;
		sp.fly(); // ������ ������ �����մϴ�
		sp.flyMode = sp.NORMAL;
		sp.fly();
		sp.land();

	}

}
