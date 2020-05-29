package inheritance;

public class Car {
	
	public int speed;

	public void speedUp() {
		speed++;
	}

	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}
}
