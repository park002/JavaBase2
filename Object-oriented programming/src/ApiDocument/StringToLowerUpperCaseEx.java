package ApiDocument;

public class StringToLowerUpperCaseEx {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		String lowerStr3 = str1.toUpperCase();
		System.out.println(lowerStr3);

		System.out.println(lowerStr1.equalsIgnoreCase(lowerStr3));
	}
}
