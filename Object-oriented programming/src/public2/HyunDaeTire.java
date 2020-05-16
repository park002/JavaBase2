package public2;

public class HyunDaeTire extends Tire {
	public HyunDaeTire(String location, int maxTire) {
		super(location, maxTire);
	}

	// 메소드
	@Override
	public boolean roll() {
		++currentTire;
		if (currentTire < maxTire) {
			System.out.println(location + "현대 타이어의 수명" + (maxTire - currentTire) + "회 출발 가능합니다");
			return true;
		} else {
			System.out.println(location + "**현대 타이어 펑크 **");
			return false;
		}
	}
}
