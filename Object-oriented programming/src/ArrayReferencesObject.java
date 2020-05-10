
public class ArrayReferencesObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Array = new String[3];
		Array[0] = "java";
		Array[1] = "java";
		Array[2] = new String("java");
		System.out.println(Array[0] == Array[1]);
		System.out.println(Array[1] == Array[2]); // false
		System.out.println(Array[0].equals(Array[2])); //true

	}

}
