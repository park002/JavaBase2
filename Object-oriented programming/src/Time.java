
public class Time {
	private int hour;
	private int minute;
	private float second;

	public int getHour() {
		System.out.print("현재 시간은 " + this.hour + "시 ");
		return hour;
	}

	public int getMinute() {
		System.out.print(this.minute + "분 ");
		return minute;
	}

	public float getSecond() {
		System.out.print(this.second + "초 입니다");
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
