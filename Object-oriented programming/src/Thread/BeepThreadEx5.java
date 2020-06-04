package Thread;

public class BeepThreadEx5 {
	public static void main(String[] args) {
		Thread thread = new BeepThreadEx4(); // 자식객체를 부모객체에 대입하면 자동형변환이 일어난다.
		// 부모객체에 정의된 필드와 메소드만을 사용 할 수 있다 하지만, 오버라이딩 된 메소드가 있다면 오버라이딩 된 메소드를 호출 한다.
		thread.start(); // 작업스레드 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
