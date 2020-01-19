package org.opentutorials.javatutorials.progenitor;

class Student implements Cloneable {
	String name; // 전역변수 "egoing"

	Student(String name) { // 기본생성자가 아닌 생성자
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		// 오버라이딩 같은경우 접근지정자가 부모의 접근지정자 보다 좁아 질 순 없다 하지만 확장은 가능하다 .
		// Object 클래스에 이러한 메소드가 있다
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		// TODO A uto-generated method stub
		Student s1 = new Student("egoing");
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name.equals(s2.name));
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
