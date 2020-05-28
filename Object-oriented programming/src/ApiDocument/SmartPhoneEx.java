package ApiDocument;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("삼성", "안드로이드");
		String strObj = sp.toString();
		System.out.println(strObj);
		System.out.println(sp);
	}
}
