package AccessModifier;

public class A {
	public int aa;
	int bb;
	private int cc;

	public A() {
		aa = 2;
		bb = 3;
		cc = 4;
		publicccc();
		defaulttt();
		privateeee();
		staticcc();
	}

	public static void staticcc() {
		System.out.println("클래스 메소드 입니다");

	}

	public void publicccc() {
		System.out.println("public 메소드 입니다");
	}

	void defaulttt() {
		publicccc();
		System.out.println("defaulttt 메소드 입니다");
	}

	private void privateeee() {
		System.out.println("privateeee 메소드 입니다");
	}

	public static void main(String[] args) {

	}

}
