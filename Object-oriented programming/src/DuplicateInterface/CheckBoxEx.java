package DuplicateInterface;

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		
		cb.method1(new CheckBox.OnSelectListener() {
			@Override
			public void OnSelect() {
				// TODO Auto-generated method stub
				System.out.println("배경을 변경합니다");
			}
		});
		cb.select();

	}

}
