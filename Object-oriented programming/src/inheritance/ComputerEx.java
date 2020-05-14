package inheritance;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Computer cp = new Computer();
		System.out.println("원면적 : " + cp.areaCircle(r));
		System.out.println();
		Calculator cal = new Calculator();

		System.out.println("원면적 : " + cal.areaCircle(r));

	}

}
