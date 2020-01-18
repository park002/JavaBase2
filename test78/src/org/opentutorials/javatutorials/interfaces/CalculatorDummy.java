package org.opentutorials.javatutorials.interfaces;

public class CalculatorDummy implements Calculatetable {
	public void setOperands(int first, int second, int third) {
		
	}

	public int sum() {
		return 60;
	}

	public int avg() {
		return 20;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());

	}

}
