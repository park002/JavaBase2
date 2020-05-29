package ApiDocument;

public class StringLengthEx {
	public static void main(String[] args) {
		String ssn = "7306241230123";

		int length = ssn.length();
		System.out.println(length);
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다");
		} else
			System.out.println("주민번호 자리수가 틀립니다.");
	}
}
