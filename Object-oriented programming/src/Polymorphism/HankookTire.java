package Polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "타이어의 수명 :" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println(location + "**타이어 펑크");
			return false;
		}
	}
}
