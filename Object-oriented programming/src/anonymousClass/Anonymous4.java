package anonymousClass;

public class Anonymous4 {
//�ʵ��� ������ //
	Worker field = new Worker() {
		// �͸��ڽİ�ü
		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("�������� �մϴ�");
		}
	};

//���������� ������
	public void method1() {
		Worker locarVar = new Worker() { // �������� �ϻ�
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("������ �մϴ�");
			}
		};
		locarVar.start();
	}

	//�Ű������� ������
	void method2(Worker wk) {
		wk.start();
	}
}
