package public2;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			
			int funckTireNumber = car.run();
			switch (funckTireNumber) {
			case 1:
				System.out.println(car.frontleftTire.location + " ��ȣ Ÿ�̾� �� ��ü");
				car.frontleftTire = new KumhoTire("��ȣ Ÿ�̾�", 10);
				break;
			case 2:
				System.out.println(car.frontRightTire.location + " ���� Ÿ�̾� �� ��ü");
				car.frontRightTire = new KumhoTire("���� Ÿ�̾�", 10);
				break;
			case 3:
				System.out.println(car.backleftTire.location + " ��ȣ Ÿ�̾� �� ��ü");
				car.backleftTire = new KumhoTire("��ȣ Ÿ�̾�", 10);
				break;
			case 4:
				System.out.println(car.backRightTire.location + " ���� Ÿ�̾� �� ��ü");
				car.backRightTire = new KumhoTire("���� Ÿ�̾�", 10);
				break;
			}
		}
	}
}
