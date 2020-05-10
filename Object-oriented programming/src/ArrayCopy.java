import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldArray = { "HI", "JAVA", "MASTER JAEHO" };
		String[] youngArray = new String[5];
		System.arraycopy(oldArray, 0, youngArray, 0, oldArray.length);
		System.out.println(Arrays.toString(youngArray));
	}

}
