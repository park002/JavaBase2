package Abstractpackage;

public class AnimalEx {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();// �۸�
		Cat cat = new Cat();
		cat.sound(); // �߿˾߿�
		System.out.println("=============");

		// ������ �ڵ� ����ȯ
		Animal an = new Dog();
		an.breathe();
		an.sound();
		Animal cat2 = new Cat();
		cat2.breathe();
		cat2.sound();
		System.out.println("============");

		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
