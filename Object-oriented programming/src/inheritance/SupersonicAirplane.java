package inheritance;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() { // 오버라이딩 부모클래스에 있는 메소드를 자식클래스가 재 정의
		// 메소드의 시그니처들이 같아야한다 이름,파라미터 타입 개수 리턴타입
		// TODO Auto-generated method stub
		if (flyMode == SUPERSONIC)
			System.out.println("초음속 비행을 시작합니다");
		else
			super.fly();

	}
}
