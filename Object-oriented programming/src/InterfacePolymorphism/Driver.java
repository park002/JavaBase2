package InterfacePolymorphism;

public class Driver {

	// �Ű������� ������
	public void drive(Vehicle vehicle) { // �ڵ�����ȯ ����
		vehicle.run();
		if (vehicle instanceof Bus) { // ������ Ÿ������ ��������ȯ�� �Ǵ°� �Ǹ� true
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			bus.run();
		}
	}
}
