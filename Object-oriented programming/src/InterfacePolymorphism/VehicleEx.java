package InterfacePolymorphism;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // �ڵ�����ȯ
		vehicle.run(); // �������̵� �� ������ �޸��ϴ� ȣ�� �� ����
	
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare(); // ��������� üũ�մϴ�.
	
	}
}
