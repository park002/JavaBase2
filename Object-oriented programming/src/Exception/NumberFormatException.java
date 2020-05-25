package Exception;

public class NumberFormatException {
	public static void main(String[] args) {
		String a = "010";
		String b = "a010";
		int value = Integer.parseInt(a);
		int value2 = Integer.parseInt(b);
		System.out.println(value);
		System.out.println(value2);
	}
}
