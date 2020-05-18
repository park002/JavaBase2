package Interface;

public class MyClass {
	// 필드의 다형성
	RemoteControl rc = new Television();

//기본 생성자
	public MyClass() {
	}

	// 기본생성자가 아닌 생성자
	MyClass(RemoteControl rc) {// new Audio()
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

//메소드
	void methodA() { // 지역변수
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
