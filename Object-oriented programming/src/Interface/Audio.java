package Interface;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio ¸¦ ÄÕ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ²ü´Ï´Ù");
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
		System.out.println("Audio volume : " + this.volume);
	}
}
