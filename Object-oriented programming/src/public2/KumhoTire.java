package public2;

public class KumhoTire extends Tire {

	// 필드
	// 생성자

	public KumhoTire(String location, int maxTire) {
		super(location, maxTire);
	}

	// 메소드
	@Override
	public boolean roll() { // 타이어 수명 계산 메소드
		++currentTire;
		if (currentTire < maxTire) {
			System.out.println(location + "금호! 타이어의 수명" + (maxTire - currentTire) + "회 출발 가능합니다");
			return true;
		} else {
			System.out.println(location + "**타이어 펑크 **");
			return false;
		}

	}
}
