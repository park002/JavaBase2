package DuplicateInterface;

public class Button {
	OnClickListener listener; // �������̽� Ÿ���� �ʵ�

	void setOnClickListener(OnClickListener listener) { // �Ű������� ������
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	// ��ø�������̽� ����
	static interface OnClickListener {
		void onClick();

	}

}
