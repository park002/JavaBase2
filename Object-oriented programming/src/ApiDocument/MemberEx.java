package ApiDocument;

public class MemberEx {
	public static void main(String[] args) {

		Member obj1 = new Member("blue"); // 100����
		Member obj2 = new Member("blue"); // 200����
		Member obj3 = new Member("red"); // 300����

		if (obj1.equals(obj2)) {
			System.out.println("obj1 obj2 �� �����մϴ�");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�");
		}
		if (obj2.equals(obj3)) { // �Ű� ���� member Ÿ�������� id �ʵ尪�� �ٸ��Ƿ� false
			System.out.println("obj2 obj3 �� �����մϴ�");
		} else {
			System.out.println("obj2�� obj3�� �������� �ʽ��ϴ�");
		}

	}
}
