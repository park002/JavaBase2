package Interface;

//SmartTv,Television,Audio �����ߴ� 
public interface RemoteControl {
	// ��� public static final �����Ϸ��� �ڵ��ϼ� ������
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;

	// �߻�޼ҵ�
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

}
