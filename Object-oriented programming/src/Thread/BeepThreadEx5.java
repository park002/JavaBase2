package Thread;

public class BeepThreadEx5 {
	public static void main(String[] args) {
		Thread thread = new BeepThreadEx4(); // �ڽİ�ü�� �θ�ü�� �����ϸ� �ڵ�����ȯ�� �Ͼ��.
		// �θ�ü�� ���ǵ� �ʵ�� �޼ҵ常�� ��� �� �� �ִ� ������, �������̵� �� �޼ҵ尡 �ִٸ� �������̵� �� �޼ҵ带 ȣ�� �Ѵ�.
		thread.start(); // �۾������� ����
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
