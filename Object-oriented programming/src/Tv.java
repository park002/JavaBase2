
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
		System.out.println(channel);
	}

	void power() {
		power = !power;
		System.out.println(power);
	}

	void channelM() {
		channel--;
	}

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.power();
		t.color("°ËÀº»ö");
		t.channelP();

	}

}
