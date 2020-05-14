package public2;

import inheritance.A;

public class D extends A {
	public D() {
		super();
		this.field = "현재 여긴 A클래스를 상속받은 D 클래스 \n 접근지정자 : protected";
		super.method();

	}

	@Override
	public void method() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		String aaa = d.field;
		System.out.println(aaa);

	}

}
