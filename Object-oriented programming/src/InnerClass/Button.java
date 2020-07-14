package InnerClass;

public class Button {

	OnClickListener listener;

	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static class OnClickListener { // (����) ��ø �������̽�
		void onClick() {
			System.out.println("������øŬ���� �̿ýô�.");
		}
	}

}
