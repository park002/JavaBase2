public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();

		// 잘못된 속도 변경
		myCar.setSpeed(-96);
		System.out.println("내 차의 속도는 0 일 것이다 :  " + myCar.getSpeed());
		myCar.setSpeed(86);
		System.out.println("현재 재호는 벤츠 C클래스 타고있다 속력은 : " + myCar.getSpeed() + "km");
		// true 라면 시동이 켜져 있다면
		System.out.println("현재 isStop=>" + myCar.isStop());
		if (!myCar.isStop()) {
			myCar.setStop(true); // 시동끔
		}
		// 시동끄기
		System.out.println(myCar.getSpeed());

	}
}
