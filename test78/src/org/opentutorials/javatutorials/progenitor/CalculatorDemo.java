package org.opentutorials.javatutorials.progenitor;

class Calculator extends Object {
	int left;
	int right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;

	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	public String toString() { //메소드오버라이딩
		return super.toString() + "this.left=>"+this.left + "this.right=>"+ this.right;
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1); 

	}

}
