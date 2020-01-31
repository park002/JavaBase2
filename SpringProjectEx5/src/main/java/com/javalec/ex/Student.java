package com.javalec.ex;

public class Student {
	private String name; // 홍길자
	private int age; // 25

	public Student(String name, int age) { //홍길자 , 26
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
