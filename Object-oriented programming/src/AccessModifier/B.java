package AccessModifier;

public class B {
	public B() {
		A a = new A();
		a.aa = 1;
		a.bb = 2;
		System.out.println(a.aa);
	}

	public static void main(String[] args) {
		B b = new B();
	}

}
