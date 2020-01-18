package org.opentutorials.javatutorials.Polymorphism;

class A {
	public String x() { // 인스턴스메소드
		return "A.x";
	}
}

class B extends A {
	public String x() { // 메소드오버라이딩
		return "B.x";
	}

	public String y() {
		return "y";
	}
}

class B2 extends A {
	public String x() { //메소드오버라이딩
		return "B2.x";
		
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B(); // B인스턴스가 A행세를 하고 있다 . 오버라이딩 한 경우 B 로 돌아온다 .
		System.out.println(obj.x());
		A obj2 = new B2(); //B2 인스턴스가 A행세를 하고 있다 
		//System.out.println(obj.x());   //B.x
		System.out.println(obj2.x()); //B2.x
	}

}
