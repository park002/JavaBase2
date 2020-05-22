package anonymousClass;

public class Button {
	OnClickListener listener; // ��������(�ʵ�)

	void setOnClickListener(OnClickListener listener) { // �Ű������ν� ������
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {// ��ø�������̽�
		// Ŭ���� ���ο� ����� �������̽��� static �� ������ Ŭ���� ��� �������̽� => ��ü�������� ���ٰ���.
		// �ν��Ͻ� �������̽��� �ݵ�� ��ü���� �� ���� ����
		void onClick();
	}

}
