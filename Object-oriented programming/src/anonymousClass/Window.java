package anonymousClass;

public class Window {
	Button button1 = new Button(); //필드의 다형성
	Button button2 = new Button();

	// 필드 초기값으로 대입
	// 익명 구현객체
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다");
		}
	};

	// 매개 값으로 필드에 대입
	Window() { // 생성자
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메시지를 보냅니다");

			}
		});
	}
}
