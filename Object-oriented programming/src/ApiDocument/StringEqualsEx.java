package ApiDocument;

public class StringEqualsEx {
	public static void main(String[] args) {
		String strVar1 = new String("Good");
		String strVar2 = "Good";
		String strVar3 = "Good";

		if (strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü ����");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}

	}
}
