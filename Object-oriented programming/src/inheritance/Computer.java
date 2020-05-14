package inheritance;

public class Computer extends Calculator {
	// 오버라이딩
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 클래스에 있는 areaCircle()");
		return Math.PI * r * r;

	}
}
