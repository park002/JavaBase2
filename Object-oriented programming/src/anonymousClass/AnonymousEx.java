package anonymousClass;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// �͸� ��ü �ʵ� ���
		anony.field.wake();

		// �͸� ��ü �������� ���
		anony.method1();

		// �Ķ���� Ÿ������ �͸�ü Ÿ��
		anony.method2(new Person() {
			
			void study() {
				System.out.println("�׸��� �����մϴ� ����");
			}
			@Override
			void wake() {
				// TODO Auto-generated method stub
				System.out.println("8�ÿ� ����մϴ�");
				study();
			}
		});
	}
}
