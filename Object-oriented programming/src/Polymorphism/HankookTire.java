package Polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Ÿ�̾��� ���� :" + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + "**Ÿ�̾� ��ũ");
			return false;
		}
	}
}
