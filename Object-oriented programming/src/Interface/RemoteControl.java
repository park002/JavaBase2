package Interface;

//SmartTv,Television,Audio 구현했다 
public interface RemoteControl {
	// 상수 public static final 컴파일러가 자동완성 시켜줌
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;

	// 추상메소드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

}
