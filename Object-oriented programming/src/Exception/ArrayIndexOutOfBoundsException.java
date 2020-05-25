package Exception;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
	
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println(data1);
			System.out.println(data2);
		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
	}
}
