package InnerClass;

public class AA {
	int field1 = 20;

	void method1() {

	}

	static int field2;

	static void method2() {

	}

	class B {
		// �ʵ�� �����͸� �����ϴ� ��
		void method() {
			field1 = 10;
			method1();
			field2 = 20;
			System.out.println(field1);
		}

	}

	static class C {
		void method() {
			// field1=10;
			field2 = 20;
			method2();
			// method1();

		}
	}
}
