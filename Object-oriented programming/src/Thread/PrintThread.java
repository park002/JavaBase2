package Thread;

public class PrintThread extends Thread { // 작업 스레드
	private boolean stop;

	public void setStop(boolean stop) { // 인스턴스 메소드
		this.stop = stop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!stop) { // stop이 false 일경우 while 문의 조건식이 true 가 되어 반복한다.
						// stop이 true 가 될 경우 while 문의 조건식 false가 되어 while문 탈출
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
