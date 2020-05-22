package anonymousClass;

public class AnEx2 {
	public static void main(String[] args) {
		Anonymous4 a4 = new Anonymous4();
		a4.field.start(); // 디자인을 합니다
		a4.method1(); // 개발을 합니다
		a4.method2(new Worker() {
			//익명자식객체
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("테스트를 합니다");
			}
		});
	}
}
