package anonymousClass;

public class Anonymous5 {
//�ʵ��� ������
	Vehicle field = new Vehicle() {
		//�͸� ������ü
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�����Ű� �޸��ϴ�");
		}
	};
	// ���������� ������
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�¿����� �޸��ϴ�");
			}
		};
		localVar.run();
	}
	// �Ű������� ������
	void method2(Vehicle ve) {
		ve.run();
	}
}
