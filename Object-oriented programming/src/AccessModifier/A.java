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
		System.out.println("Ŭ���� �޼ҵ� �Դϴ�");

	}

	public void publicccc() {
		System.out.println("public �޼ҵ� �Դϴ�");
	}

	void defaulttt() {
		publicccc();
		System.out.println("defaulttt �޼ҵ� �Դϴ�");
	}

	private void privateeee() {
		System.out.println("privateeee �޼ҵ� �Դϴ�");
	}

	public static void main(String[] args) {

	}

}
