package org.opentutorials.javatutorials.accessModify;

class Calculator {
	private int left, right; // 접근 지정자 private 전역변수

	public void setOprands(int left, int right) {// 접근지정자 public
		this.left = left;
		this.right = right;
	}

	private int _sum() {// private 인스턴스메소드 반환형 int
		return this.left + this.right;
	}

	public void sumDecoPlus() {
		System.out.println("++++" + (_sum()) + "++++");
	}

	public void sumDecoMinus() {
		System.out.println("----" + _sum() + "----");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();

		c1.setOprands(10, 20);
		c1.sumDecoPlus(); // ++++30++++
		c1.sumDecoMinus(); // ----30----

	}

}
