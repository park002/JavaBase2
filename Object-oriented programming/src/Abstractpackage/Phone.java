package Abstractpackage;

public abstract class Phone {
	// �ʵ�
	public String owner;

	// ������
	public Phone(String owenr) {
		this.owner = owenr;
	}

	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ ŵ�ϴ�");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}

}
