package public2;

public class Car {
	// �ʵ��� ������
	Tire frontleftTire = new Tire("�� ���� ����", 5);
	Tire frontRightTire = new Tire("�� ������ ����", 5);
	Tire backleftTire = new Tire("�� ���� ����", 5);
	Tire backRightTire = new Tire("�� ������ ����", 2);

	// ������
	// �޼ҵ�

	public int run() { // ���
		System.out.println("���� ��� �մϴ�");
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
		return 0; // �ƹ��͵� ��ũ���� ���� �����۵��̸� return 0;
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�");
	}
}
