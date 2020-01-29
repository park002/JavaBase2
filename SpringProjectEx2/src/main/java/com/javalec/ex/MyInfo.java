package com.javalec.ex;

import java.util.ArrayList;

public class MyInfo {
	private String name;//홍길동동이
	private double height; //183
	private double weight; //84
	private ArrayList<String> hobbys; //수영,독서,영화감상
	private BMICalculator bmiCalculator; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public void bmiCalculation() {
		bmiCalculator.bmicalculation(weight, height);
	}

	public void getInfo() {
		System.out.println("이름:" + name);
		System.out.println("키:" + height);
		System.out.println("몸무게:" + weight);
		System.out.println("취미:" + hobbys);
		bmiCalculation();
		
	}

}
