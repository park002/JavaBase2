
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("���", 5600);
		// �ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("����:" + myCar.color);
		System.out.println("�ְ�ӵ�:" + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		// �ʵ� �� ����

		System.out.println("���� ����� �ӵ�:" + myCar.speed);
	}

}
