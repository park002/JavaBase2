package Interface;

public class SoundableEx {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}
	private static void printSound(Soundable soundable) { // Ŭ���� �޼ҵ�
		// soundable = new Cat();
		System.out.println(soundable.sound());
	}

}
