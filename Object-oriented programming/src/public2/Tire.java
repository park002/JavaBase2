package public2;

public class Tire {
	// �ʵ�
	String location; // Ÿ�̾� ��ȣ��
	int maxTire; // Ÿ�̾����
	int currentTire; // ���� Ÿ�̾� Ƚ��

	// ������
	public Tire(String location, int maxTire) {
		this.location = location;
		this.maxTire = maxTire;
	}

	public boolean roll() { // Ÿ�̾� ���� ��� �޼ҵ�
		++currentTire; // currentTire = currentTire+1;
		if (currentTire < maxTire) {
			System.out.println(location + "Ÿ�̾��� ����" + (maxTire - currentTire) + "ȸ ��� �����մϴ�");
			return true;
		} else {
			System.out.println(location + "**Ÿ�̾� ��ũ **");
			return false;
		}
	}

	// �޼ҵ�
}
