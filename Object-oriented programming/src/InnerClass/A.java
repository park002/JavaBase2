package InnerClass;

class A {
	A() {
		System.out.println("A 객체가 생성 됨");
	}

	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("인스턴스 멤버클래스 B객체가 생성 됨");
		}

		int field1;

		// static int field2;
		void method1() {

		}
	} // B

	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("정적 멤버클래스 C객체가 생성됨");
		}

		int field1;
		static int field2;

		void method() {

		}

		static void method2() {

		}
	}

	void method() {
		// 로컬클래스
		class D {
			D() {
				System.out.println("로컬클래스 D객체가 생성되었다.");
			}

			int field1;

			void method1() {
				System.out.println("로컬클래스 D.method1() 호출. 인스턴스 필드와 메소드만 사용가능.");
			}

		}
		D d = new D();
		d.field1 = 3;
		d.method1();

	}
} // A
