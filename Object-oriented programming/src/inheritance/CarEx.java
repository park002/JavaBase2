package inheritance;

public class CarEx extends Car {
	@Override
	public void speedUp() { // �޼ҵ� �������̵�
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
