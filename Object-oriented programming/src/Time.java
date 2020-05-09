
public class Time {
	private int hour;
	private int minute;
	private float second;

	public int getHour() {
		System.out.print("���� �ð��� " + this.hour + "�� ");
		return hour;
	}

	public int getMinute() {
		System.out.print(this.minute + "�� ");
		return minute;
	}

	public float getSecond() {
		System.out.print(this.second + "�� �Դϴ�");
		return second;
	}

	public void SetHour(int hour) {
		if (0 > hour || hour > 23)
			return;
		this.hour = hour;
	}

	public void SetMinute(int minute) {
		if (0 > minute || 59 < minute)
			return;
		this.minute = minute;
	}

	public void SetSecond(float Second) {
		if (0.0f > minute || 59.99f < minute)
			return;
		this.second = Second;
	}

	public static void main(String[] args) {
		Time t = new Time();
		t.SetHour(50);
		t.getHour();
		t.SetMinute(90);
		t.getMinute();
		t.SetSecond(12.2f);
		t.getSecond();
	}
}
