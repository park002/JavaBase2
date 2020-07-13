package InnerClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		
		AA.B b = a.new B();
		b.method();
	}

}
