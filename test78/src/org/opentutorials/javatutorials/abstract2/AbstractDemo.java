package org.opentutorials.javatutorials.abstract2;

abstract class A {

	abstract public void b(int a); // 추상메소드

	public void d() {
		System.out.println("world");
	}
}

class B extends A { // 추상클래스 를 사용하기 위해 상속받은 B클래스 오버라이딩
	public void b(int a) {
	 
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// A a = new A();
		B obj = new B();
		
		obj.d();

	}

}
