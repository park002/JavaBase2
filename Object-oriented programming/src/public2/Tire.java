package public2;

public class Tire {
	// 필드
	String location; // 타이어 상호명
	int maxTire; // 타이어수명
	int currentTire; // 현재 타이어 횟수

	// 생성자
	public Tire(String location, int maxTire) {
		this.location = location;
		this.maxTire = maxTire;
	}

	public boolean roll() { // 타이어 수명 계산 메소드
		++currentTire; // currentTire = currentTire+1;
		if (currentTire < maxTire) {
			System.out.println(location + "타이어의 수명" + (maxTire - currentTire) + "회 출발 가능합니다");
			return true;
		} else {
			System.out.println(location + "**타이어 펑크 **");
			return false;
		}
	}

	// 메소드
}
