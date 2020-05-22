package DuplicateInterface;

public class CheckBox {
	// 필드로써 다형성
	OnSelectListener select;

	public void method1(OnSelectListener select) {
		this.select = select;
	}

	void select() {
		select.OnSelect();
	}

	static interface OnSelectListener { //중첩인터페이스
		void OnSelect();
	}
}
