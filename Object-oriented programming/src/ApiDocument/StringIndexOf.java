package ApiDocument;

public class StringIndexOf {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location);

		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
			int location2 = subject.indexOf("�ڹ�");
			System.out.println(location2);
		} else
			System.out.println("�ڹٿ� ������ ���� å�̱���");
	}
	
}
