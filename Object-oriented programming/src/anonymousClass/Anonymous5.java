package anonymousClass;

public class Anonymous5 {
//필드의 다형성
	Vehicle field = new Vehicle() {
		//익명 구현객체
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("자전거가 달립니다");
		}
	};
	// 지역변수의 다형성
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("승용차가 달립니다");
			}
		};
		localVar.run();
	}
	// 매개변수의 다형성
	void method2(Vehicle ve) {
		ve.run();
	}
}
