package com.javalec.ex;

public class BMICalculator {
	private double lowWeight; // 저체중 18.5
	private double normal; // 정상 23
	private double overWeight; // 과체중 25
	private double obesity; // 비만 30

	public void bmicalculation(double weight, double height) {
		double h = height * 0.01; // 키 183 1.83
		double result = weight / (h * h); // 몸무게 84
		// System.out.println("BMI 지수 :" + String.format("%.3f", result)); //25
		System.out.println("BMI 지수:" + (int) result);
		result = (int) result;

		if (result > obesity) { // result => 25>30
			System.out.println("비만입니다");

		} else if (result > overWeight) { // => 25.083>25
			System.out.println("과체중입니다");

		} else if (result > normal) { // 25> 23
			System.out.println("정상입니다");
		} else {
			System.out.println("저체중입니다");
		}

	}

	public double getLowWeight() {
		return lowWeight;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

}
