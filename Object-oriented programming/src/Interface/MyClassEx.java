package Interface;

public class MyClassEx {
	public static void main(String[] args) {
		System.out.println("1)---------------");
		MyClass Myclass1 = new MyClass();
		Myclass1.rc.turnOn();
		Myclass1.rc.setVolume(5);
		Myclass1.rc.turnOff();
		
		System.out.println("2)---------------");
		MyClass Myclass2 = new MyClass(new Audio());
		Myclass2.rc.turnOff();
		
		System.out.println("3)---------------");
		MyClass Myclass3 = new MyClass();
		Myclass3.methodA();
		Myclass3.rc.turnOff();
		
		System.out.println("4)---------------");
		MyClass Myclass4 = new MyClass();
		Myclass4.methodB(new Television());
		Myclass4.rc.turnOff();
		
		
		
		
	}
}
