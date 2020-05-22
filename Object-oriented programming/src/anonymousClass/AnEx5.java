package anonymousClass;

public class AnEx5 {
	public static void main(String[] args) {
		Anonymous5 a5 = new Anonymous5();
		a5.field.run();
		a5.method1();
		
		a5.method2(new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다");
			}
		});
	}

}
