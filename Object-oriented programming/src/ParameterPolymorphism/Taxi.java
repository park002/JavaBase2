package ParameterPolymorphism;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("Taxi 가 달립니다.");
	}
}
