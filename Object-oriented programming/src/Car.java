
public class Car {
	// �ʵ�
	int speed;

	// ������

	// �޼ҵ�
	int getSpeed() {
		return speed;
	}

	void KeyTurnOn() {
		System.out.println("�õ��� �׽��ϴ�");
	}

	void run() {
		for (int i = 1; i <= 50; i++) {
			speed = i;
			System.out.println("��� �޸��ϴ� �ΊP�ε� \n�ü�:" + speed + "km");
		}

	}
}
