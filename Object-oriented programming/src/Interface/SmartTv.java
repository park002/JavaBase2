package Interface;

public class SmartTv implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� �մϴ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > MAX_VALUE) {
			this.volume = MAX_VALUE;
		} else if (volume < MIN_VALUE) {
			this.volume = MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� smartTv ���� : " + this.volume);
	}

	@Override
	public void Search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�� �˻��մϴ�");
	}

}
