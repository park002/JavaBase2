package anonymousClass;

public class AnEx2 {
	public static void main(String[] args) {
		Anonymous4 a4 = new Anonymous4();
		a4.field.start(); // �������� �մϴ�
		a4.method1(); // ������ �մϴ�
		a4.method2(new Worker() {
			//�͸��ڽİ�ü
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("�׽�Ʈ�� �մϴ�");
			}
		});
	}
}
