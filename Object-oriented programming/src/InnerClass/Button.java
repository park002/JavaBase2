package InnerClass;

public class Button {

	OnClickListener listener;

	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener { // (정적) 중첩 인터페이스
		void onClick();
	}

}
