package Polymorphism;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("오버라이딩 했땅꼐!!");
	}

	public void method3() {
		System.out.println("method3() 사용 못할 거임 ");
	}

}
