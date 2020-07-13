package InnerClass;

class A {
	A() {
		System.out.println("A ��ü�� ���� ��");
	}

	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() {
			System.out.println("�ν��Ͻ� ���Ŭ���� B��ü�� ���� ��");
		}

		int field1;

		// static int field2;
		void method1() {

		}
	} // B

	// ���� ��� Ŭ����
	static class C {
		C() {
			System.out.println("���� ���Ŭ���� C��ü�� ������");
		}

		int field1;
		static int field2;

		void method() {

		}

		static void method2() {

		}
	}

	void method() {
		// ����Ŭ����
		class D {
			D() {
				System.out.println("����Ŭ���� D��ü�� �����Ǿ���.");
			}

			int field1;

			void method1() {
				System.out.println("����Ŭ���� D.method1() ȣ��. �ν��Ͻ� �ʵ�� �޼ҵ常 ��밡��.");
			}

		}
		D d = new D();
		d.field1 = 3;
		d.method1();

	}
} // A
