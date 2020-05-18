package Interface;

public class SmartTv implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다");
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
		System.out.println("현재 smartTv 볼륨 : " + this.volume);
	}

	@Override
	public void Search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}

}
