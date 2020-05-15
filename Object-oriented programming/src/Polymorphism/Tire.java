package Polymorphism;

public class Tire {
	// 필드
	public int maxRotation; // 타이어의 수명
	public int accumulateRotation; // 타이어 회전수
	public String location; // 타이어 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() { // 타이어 살아있나 죽었나 여부
		++accumulateRotation; // 타이어 1회전
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "타이어의 수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println(location + "**타이어 펑크**");
			return false;
		}
	}

}
