package public2;

import inheritance.A;

public class D extends A {
	public D() {
		super();
		this.field = "���� ���� AŬ������ ��ӹ��� D Ŭ���� \n ���������� : protected";
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
