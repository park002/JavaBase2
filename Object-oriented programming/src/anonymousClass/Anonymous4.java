package anonymousClass;

public class Anonymous4 {
//필드의 다형성 //
	Worker field = new Worker() {
		// 익명자식객체
		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("디자인을 합니다");
		}
	};

//지역변수의 다형성
	public void method1() {
		Worker locarVar = new Worker() { // 지역변수 일뿐
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("개발을 합니다");
			}
		};
		locarVar.start();
	}

	//매개변수의 다형성
	void method2(Worker wk) {
		wk.start();
	}
}
