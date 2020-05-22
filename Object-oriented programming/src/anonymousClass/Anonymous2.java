package anonymousClass;

public class Anonymous2 {

	// 필드 선언과 초기값 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("Tv를 켭니다");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("Tv를 끕니다");
		}
	};

	void method() {
		// 지역변수로써 대입
		RemoteControl var = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("오디오를 켭니다");

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("오디오를 끕니다");
			}
		};

		var.turnOn();
		var.turnOff();
	}

	// 매개변수로써의 대입
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();

	}

}
