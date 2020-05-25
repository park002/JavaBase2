package Exception;

public class ClassCastException {
	public static void main(String[] args) {

		Cat cat = new Cat();
		changeDog(cat);
	}

	static void changeDog(Animal animal) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal; // 강제 형변환 성공
		}
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else
			System.out.println("Dog는 강제 형변환을 할 수 없습니다");

	}
}
