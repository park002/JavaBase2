package _Practice;

class Data {
	int x;
}

public class Star {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("x�� ����=>" + d.x); // 10
		change(d); // 1000
		System.out.println("After Change(d.x)");
		System.out.println("x�ǰ��� =>" + d.x); // 10

	}

	static void change(Data x) {
		x.x = 1000;
		System.out.println("x�� ����=>" + x.x);
	}

}
