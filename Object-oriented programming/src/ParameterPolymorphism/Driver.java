package ParameterPolymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { //call by references; 자동 형 변환
		vehicle.run();
	}
}
