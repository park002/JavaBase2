package DuplicateInterface;

public class Button {
	OnClickListener listener; // 인터페이스 타입의 필드

	void setOnClickListener(OnClickListener listener) { // 매개변수의 다형성
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	// 중첩인터페이스 선언
	static interface OnClickListener {
		void onClick();

	}

}
