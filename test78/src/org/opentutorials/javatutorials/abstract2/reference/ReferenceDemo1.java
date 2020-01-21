package org.opentutorials.javatutorials.abstract2.reference;

class A {
	public int id; // 1

	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo1 {
	public static void runValue() { // 클래스메소드 기본형데이터타입
		int a = 1; // a= 1
		int b = a; // b= 1
		System.out.println(b); //1
		b = 2; // b =2
		System.out.println(b); //2 
 		System.out.println("runValue() =>" + a); //1
	}

	public static void runReference() { // 클래스 메소드 참조형데이터타입
		A a = new A(1);
		A b = a;

		b = new A(2);
		b.id = 2;
		System.out.println("runReference()=>" + a.id);

		int t=10;
		t +=2;
		System.out.println(t);
		t%=5;
		
		System.out.println(t);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue(); //기본형데이터타입 호출.
		runReference();
	
		
	}

}
