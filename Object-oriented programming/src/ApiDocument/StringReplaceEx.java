package ApiDocument;

public class StringReplaceEx {
	public static void main(String[] args) {

		String oldStr = "�ڹٴ� ��ü���� ����̴�. �ڹٴ� ǳ���� API�� �����Ѵ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
