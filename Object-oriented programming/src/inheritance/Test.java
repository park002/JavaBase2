package inheritance;

class king extends Test {
	public static void main(String[] args) {
		king k = new king();
		Test t = new Test();
		k.test();
	}
}

public class Test {
	int a = 1;
	int b = 2;

	public void test() {
		System.out.println("나는야 부모Test");
	}

}
