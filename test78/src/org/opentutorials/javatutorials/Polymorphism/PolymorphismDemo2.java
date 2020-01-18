package org.opentutorials.javatutorials.Polymorphism;

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A() {
		return "A";
	}

	public String B() {
		return "B";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) { // 인터페이스와 다형성
		D obj = new D(); // D를 인스턴스화 해서 obj 인스턴스 생성
		
		//한 객체가 여러개의 데이터 타입을 가질 수 있다.
		I2 objI2 = new D(); //D라는 클래스가 objI2변수에 인스턴스화 하고 있다 데이터 타입은 I2다
	D objI4 = (D)objI2; // objI2가 가리키고 있는 객체를 D타입으로 명시적으로 형변환을 해서 objI4에 줬당 
	//string > int 
	//I D
		
		
		
		I3 objI3 = new D();

		
		obj.A();
		obj.B();
	
		System.out.println(objI2.A());
		System.out.println(objI3.B());
	}

}
