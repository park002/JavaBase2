package Exception;

public class ClassCastException {
	public static void main(String[] args) {

		Cat cat = new Cat();
		changeDog(cat);
	}

	static void changeDog(Animal animal) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal; // ���� ����ȯ ����
		}
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else
			System.out.println("Dog�� ���� ����ȯ�� �� �� �����ϴ�");

	}
}
