package DuplicateInterface;

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		
		cb.method1(new CheckBox.OnSelectListener() {
			@Override
			public void OnSelect() {
				// TODO Auto-generated method stub
				System.out.println("����� �����մϴ�");
			}
		});
		cb.select();

	}

}
