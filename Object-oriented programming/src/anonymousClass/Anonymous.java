package anonymousClass;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	Person field = new Person() { // �͸��ڽİ�ü

		void work() { // �͸��ڽİ�ü�� �ִ� �޼ҵ�
			System.out.println("����մϴ�");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}

	};

	void method1() { // AnonymousŬ������ �ν��Ͻ� �޼ҵ�
		Person localVar = new Person() { // ���������ν� �͸�ü
			void walk() {
				System.out.println("��å �մϴ�");
			}

			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				walk();
			}
		};
		// ���� ���� ���
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
