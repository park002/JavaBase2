package org.opentutorials.javatutorials.final1;

class Calculator {
	static final double PI = 3.14; // 클래스 변수 final
	int left, right; // 인스턴스변수 && 전역변수

	public void setOprands(int left, int right) { // 인스턴스메소드
		this.left = left;
		this.right = right;
		// Calculator.PI=2.0;
	}

	void abc() {

	}
}

class Calculatorextends extends Calculator {
	void abc() {
		System.out.println(" ");
	}
}

public class final11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
