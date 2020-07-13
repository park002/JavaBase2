package InnerClass;

public class ButtonEx2 {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnclickListener(new CallListener());
		btn.touch();
		btn.setOnclickListener(new MessageListener());
		btn.touch();

	}
}
