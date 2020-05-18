package Interface;

public class SmartTvEx {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		String url = "www.naver.com";
		RemoteControl rc = stv;
		Searchable searchable = stv;

		searchable.Search(url);
		rc.turnOn();

	}
}
