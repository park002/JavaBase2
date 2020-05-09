
public class Tv {
	private String color;
	private boolean power;
	private int channel;

	void color(String color) {
		this.color = color;
		System.out.println(color);
	}

	void channelP() {
		channel++;
	}

	void power() {
		power = !power;
		System.out.println(power);
	}

	void channelM() {
		channel--;
	}

	public static void main(String[] args) {
		Tv[] Tvarr = new Tv[3];
		for (int i = 0; i < Tvarr.length; i++) {
			Tvarr[i] = new Tv();
			Tvarr[i].channel = i + 10; // 10 11 12
		}
		for (int i = 0; i < Tvarr.length; i++) {
			Tvarr[i].channelP();
			System.out.printf("Tvarr[%d].channel=%d%n", i, Tvarr[i].channel);
		}
	}

}
