package InterfacePolymorphism;

public class DriverEx {

	public static void main(String[] args) {
		Driver dr = new Driver();
		dr.drive(new Bus());
		dr.drive(new Taxi());
		// vehicle = new Bus();

	}
}
