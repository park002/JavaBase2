package InterfacePolymorphism;

public interface InterfaceC extends InterfaceA, InterfaceB {

	// 추상메소드 선언 --> 반드시 구현한 클래스에서 오버라이딩 해주어야 한다 .
	public void methodC();

}
