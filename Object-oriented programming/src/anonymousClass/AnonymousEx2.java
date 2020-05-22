package anonymousClass;

public class AnonymousEx2 {
	public static void main(String[] args) {
		Anonymous2 a2 = new Anonymous2();
		a2.field.turnOn();
		a2.field.turnOff();
		a2.method();
		a2.method2(new RemoteControl() {

			@Override
			public void turnOn() { // 매개값
				// TODO Auto-generated method stub
				System.out.println("SmartTv 를 켭니다");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("SmartTv를 끕니다");
			}

		});
	}
}
