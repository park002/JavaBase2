package ApiDocument;

import inheritance.Car;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		// ù ��° ���
		Class clazz = Car.class;

		// �� ��° ���
		Class clazz2 = Class.forName("inheritance.Car");

		// �� ��° ���
		Car car = new Car();
		Class clazz3 = car.getClass();

		System.out.println(clazz.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3);

	}
}
