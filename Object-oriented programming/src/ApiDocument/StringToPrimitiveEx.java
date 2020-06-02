package ApiDocument;

public class StringToPrimitiveEx {
	public static void main(String[] args) {
		// 문자열을 primitive 타입으로 변환

		int value1 = Integer.parseInt("1234567890");
		boolean value2 = Boolean.parseBoolean("true");
		byte value3 = Byte.parseByte("10");
		double value4 = Double.parseDouble("10.2");
		float value5 = Float.parseFloat("10.5");
		long value6 = Long.parseLong("10000000000");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);

	}
}
