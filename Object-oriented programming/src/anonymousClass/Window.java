package anonymousClass;

public class Window {
	Button button1 = new Button(); //�ʵ��� ������
	Button button2 = new Button();

	// �ʵ� �ʱⰪ���� ����
	// �͸� ������ü
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� �̴ϴ�");
		}
	};

	// �Ű� ������ �ʵ忡 ����
	Window() { // ������
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("�޽����� �����ϴ�");

			}
		});
	}
}
