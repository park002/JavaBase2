package InterfacePolymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�");
	}
	//����(�ڽ�)
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�");
	}

}
