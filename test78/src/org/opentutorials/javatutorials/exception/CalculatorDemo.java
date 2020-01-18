package org.opentutorials.javatutorials.exception;

class DivideException extends Exception { // checkedException
	  int left; // 지역변수
	  int right; // 지역변수
	// 생성자 => 객체가 가장먼저 해야 할 일 (초기화)

	DivideException() { // 메소드명 == 클래스명 같은 것 생성자 자식생성자 호출전 먼저 부모클래스 생성자를 부르는게 국룰이다 .
		super(); // 부모생성자 호출
	}

	// 자바는 기본생성자를 자동으로 만들어 준다 . 하지만 기본생성자를 다르게 생성자를 정의 할 경우 기본생성자를 우리가 만들어 줘야 하는 것 이
	// 국룰이다 .
	DivideException(String message) { // 기본생성자가 아닌 다른 생성자 를 정의 했다 .이런 경우 자바의 특성상 기본 생성자를 명시적으로 정의 해줘야 한다 .
		super(message);
	}

	DivideException(String message, int left, int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
}
class Calculator { // default
	int left, right; // 전역변수 //10,0 담김

	public void setOprands(int left, int right) { // 인스턴스메소드

		this.left = left;
		this.right = right;
	}

	public void divide() throws DivideException { // 인스턴스메소드 throws 로 divide() 호출하는 곳으로 예외처리 던진다
		if (right == 0) {
			// ArithmeticException a = new ArithmeticException();
			throw new DivideException("수학에서는 0으로  나눌 수 없습니다", this.left, this.right); // 주체적으로 예외를 생성하는법 unchecked
		}
		System.out.println("divide() end");
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide(); //여기 자체가 예외.
		} catch (DivideException e) {
			e.printStackTrace();
			System.out.println(e.left);
			System.out.println(e.right);
		}

	}

}
