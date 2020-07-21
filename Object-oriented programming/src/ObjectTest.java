import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Computer2 {
	private int serial;
	private String owenr;

	Computer2(int serial, String owner) {
		this.serial = serial;
		this.owenr = owner;
	}

	public int CompareTo(Object obj) {
		return this.serial - ((Computer2) obj).serial;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getOwenr() {
		return owenr;
	}

	public void setOwenr(String owenr) {
		this.owenr = owenr;
	}

}

public class ObjectTest {

	public static void main(String[] args) {
		List<Computer2> list = new ArrayList<Computer2>();
		list.add(new Computer2(500, "Egoing"));
		list.add(new Computer2(300, "hoya"));
//		for (Computer2 cp2 : list) {
//			System.out.println(cp2.getOwenr());
//			System.out.println(cp2.getSerial());
//		}
//
//		Computer2 cp2 = new Computer2(500, "Egoing2");
//		System.out.println("===============");
//		System.out.println(cp2.CompareTo(new Computer2(300, "jaeho")));
	}
}
