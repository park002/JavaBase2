package public2;

public class KumhoTire extends Tire {

	// �ʵ�
	// ������

	public KumhoTire(String location, int maxTire) {
		super(location, maxTire);
	}

	// �޼ҵ�
	@Override
	public boolean roll() { // Ÿ�̾� ���� ��� �޼ҵ�
		++currentTire;
		if (currentTire < maxTire) {
			System.out.println(location + "��ȣ! Ÿ�̾��� ����" + (maxTire - currentTire) + "ȸ ��� �����մϴ�");
			return true;
		} else {
			System.out.println(location + "**Ÿ�̾� ��ũ **");
			return false;
		}

	}
}
