package org.opentutorials.javatutorials.abstract2.reference;

public class ReferenceParameterDemo {
	static void _value(int b) { // 기본형데이터타입 클래스 메소드
		b = 2; // b=2
	}

	static void runValue() { // 기본형데이터타입 클래스메소드
		int a = 1;
		_value(a);
		System.out.println("runValue()=>" + a);
	}

	static void _reference1(A b) { // 참조형 데이터 타입 클래스 메소드 A b = a
																						//b = new A(2)
		b = new A(2); // 
	}
//
	static void runReference1() {
		A a = new A(1); // 접근지정자가 default 때문에 같은 패키지 내에서 사용가능 .
		_reference1(a);
		System.out.println("runReference1()=>" + a.id);
		// a.id=1;
	}

///////////////////////////////////////////////////////////////////////////////////////////////
	static void _reference2(A b) {  // A b = a;
		b.id = 2; 
	}

	static void runReference2() {
		A a = new A(1);
		_reference2(a); 
		System.out.println("runReference2()=>" + a.id); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		int a = 2;
		int b = 3;
		b = a;
		System.out.println("기본형 데이터 타입 =>" + b);
		runReference1();
		runReference2();

	}

}
