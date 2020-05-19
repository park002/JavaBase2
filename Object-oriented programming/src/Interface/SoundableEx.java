package Interface;

public class SoundableEx {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}
	private static void printSound(Soundable soundable) { // 클래스 메소드
		// soundable = new Cat();
		System.out.println(soundable.sound());
	}

}
