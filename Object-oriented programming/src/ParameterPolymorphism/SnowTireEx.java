package ParameterPolymorphism;

public class SnowTireEx {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run(); // 스노우 타이어 구러갑니다 뚜루루루
		tire.run();

	}
}
