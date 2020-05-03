package _Practice;

class Data {
	int x;
}

public class Star {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("x의 값은=>" + d.x); // 10
		change(d); // 1000
		System.out.println("After Change(d.x)");
		System.out.println("x의값은 =>" + d.x); // 10

	}

	static void change(Data x) {
		x.x = 1000;
		System.out.println("x의 값은=>" + x.x);
	}

}
