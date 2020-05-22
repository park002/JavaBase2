package anonymousClass;

public class Button {
	OnClickListener listener; // 전역변수(필드)

	void setOnClickListener(OnClickListener listener) { // 매개변수로써 다형성
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {// 중첩인터페이스
		// 클래스 내부에 선언된 인터페이스로 static 가 붙으면 클래스 멤버 인터페이스 => 객체생성없이 접근가능.
		// 인스턴스 인터페이스는 반드시 객체생성 후 접근 가능
		void onClick();
	}

}
