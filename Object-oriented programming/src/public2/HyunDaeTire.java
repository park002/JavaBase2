package public2;

public class HyunDaeTire extends Tire {
	public HyunDaeTire(String location, int maxTire) {
		super(location, maxTire);
	}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++currentTire;
		if (currentTire < maxTire) {
			System.out.println(location + "���� Ÿ�̾��� ����" + (maxTire - currentTire) + "ȸ ��� �����մϴ�");
			return true;
		} else {
			System.out.println(location + "**���� Ÿ�̾� ��ũ **");
			return false;
		}
	}
}
