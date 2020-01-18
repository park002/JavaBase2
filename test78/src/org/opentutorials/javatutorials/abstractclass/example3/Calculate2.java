package org.opentutorials.javatutorials.abstractclass.example3;
abstract class a  {
	public abstract void aa();
}
abstract class Calculator { // 추상클래스
	int left, right; // 전역변수

	int _sum() { // default 메소드
		return this.left + this.right;
	}

	int _avg() {
		return (this.left + this.right) / 2;
	}

	public void setOprands(int left, int right) { // 인스턴스메소드
		this.left = left;
		this.right = right;
	}

	public abstract void sum(); // 추상메소드

	public abstract void avg(); // 추상메소드

	public void run() { // 인스턴스메소드
		sum();
		avg();
	}
}

class CalculatorDecoplus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + (_sum()));
	}

	public void avg() {
		System.out.println("+ avg:" + _avg());
	}
}

class CalculatorDecominus extends Calculator {
	public void sum() {
		System.out.println("- sum :" + (_sum()));
	}

	public void avg() {
		System.out.println("- avg:" + _avg());
	}
}

public class Calculate2 {
	// 다형성
	public static void execute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new CalculatorDecoplus(); // 다형성 시작. 하나의 메소드나 클래스가 다양한 방법으로 동작하는 것을 의미
		
		c1.setOprands(10, 20);
		Calculator c2 = new CalculatorDecominus(); // 다형성 시작. 하나의 메소드나 클래스가 다양한 방법으로 동작하는 것을 의미
		
		c2.setOprands(10, 20);
		execute(c1);
		execute(c2);

		// Calculate2.execute(c1);
		// execute(c2);

	}

}
