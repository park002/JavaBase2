package ParameterPolymorphism;

public class SnowTireEx {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run(); // ����� Ÿ�̾� �������ϴ� �ѷ���
		tire.run();

	}
}
