package Polymorphism;

public class Tire {
	// �ʵ�
	public int maxRotation; // Ÿ�̾��� ����
	public int accumulateRotation; // Ÿ�̾� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// �޼ҵ�
	public boolean roll() { // Ÿ�̾� ����ֳ� �׾��� ����
		++accumulateRotation; // Ÿ�̾� 1ȸ��
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Ÿ�̾��� ����" + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + "**Ÿ�̾� ��ũ**");
			return false;
		}
	}

}
