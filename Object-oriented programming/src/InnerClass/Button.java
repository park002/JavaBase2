package InnerClass;

public class Button {

	OnClickListener listener;

	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static class OnClickListener { // (정적) 중첩 인터페이스
		void onClick() {
			System.out.println("정적중첩클래스 이올시다.");
		}
	}

}
