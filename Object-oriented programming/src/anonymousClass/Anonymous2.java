package anonymousClass;

public class Anonymous2 {

	// �ʵ� ����� �ʱⰪ ����
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("Tv�� �մϴ�");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("Tv�� ���ϴ�");
		}
	};

	void method() {
		// ���������ν� ����
		RemoteControl var = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("������� �մϴ�");

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("������� ���ϴ�");
			}
		};

		var.turnOn();
		var.turnOff();
	}

	// �Ű������ν��� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();

	}

}
