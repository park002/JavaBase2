package Interface;

public class MyClass {
	// �ʵ��� ������
	RemoteControl rc = new Television();

//�⺻ ������
	public MyClass() {
	}

	// �⺻�����ڰ� �ƴ� ������
	MyClass(RemoteControl rc) {// new Audio()
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

//�޼ҵ�
	void methodA() { // ��������
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
