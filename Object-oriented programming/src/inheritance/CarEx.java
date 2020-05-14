package inheritance;

public class CarEx extends Car {
	@Override
	public void speedUp() { // 메소드 오버라이딩
		this.speed *= speed;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		CarEx car = new CarEx();
		car.speed = 10;
		car.speedUp();
		car.stop();
	}
}
