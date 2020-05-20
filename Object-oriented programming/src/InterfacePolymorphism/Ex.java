package InterfacePolymorphism;

public class Ex {
	public static void main(String[] args) {
		ImplementationC Iclass = new ImplementationC();
		InterfaceA Ia = Iclass;
		Ia.methodA();

		InterfaceB Ib = Iclass;
		Ib.methodB();

		InterfaceC Ic = Iclass;
		Ic.methodC();
		Ic.methodA();
		Ic.methodB();

	}
}
