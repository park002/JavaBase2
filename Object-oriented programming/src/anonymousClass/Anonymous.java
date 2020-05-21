package anonymousClass;

public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() { // 익명자식객체

		void work() { // 익명자식객체에 있는 메소드
			System.out.println("출근합니다");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}

	};

	void method1() { // Anonymous클래스의 인스턴스 메소드
		Person localVar = new Person() { // 지역변수로써 익명객체
			void walk() {
				System.out.println("산책 합니다");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		// 지역 변수 사용
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
