package DuplicateInterface;

public class CheckBox {
	// �ʵ�ν� ������
	OnSelectListener select;

	public void method1(OnSelectListener select) {
		this.select = select;
	}

	void select() {
		select.OnSelect();
	}

	static interface OnSelectListener { //��ø�������̽�
		void OnSelect();
	}
}
