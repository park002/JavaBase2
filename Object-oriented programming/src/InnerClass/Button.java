package InnerClass;

public class Button {

	OnClickListener listener;

	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener { // (����) ��ø �������̽�
		void onClick();
	}

}
