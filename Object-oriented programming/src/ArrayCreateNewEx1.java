import java.util.Arrays;

public class ArrayCreateNewEx1 {

	public static void main(String[] args) {
		int[] abc = {};

		// TODO Auto-generated method stub
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr1[%d] : %2d%n", i, arr[i]);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));
		
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr1[%d] : %d%n", i, arr[i]);
		}
		System.out.println();

		float[] arr2 = new float[3];
		for (int i = 0; i < arr2.length; i++)
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		arr2[0] = 0.1f;
		arr2[1] = 0.2f;
		arr2[2] = 0.3f;
		System.out.println();
		for (int i = 0; i < arr2.length; i++)
			System.out.println("arr2[" + i + "] : " + arr2[i]);

		System.out.println();

		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++)
			System.out.println("arr3[" + i + "] : " + arr3[i]);

		arr3[0] = "1¿ù";
		arr3[1] = "2¿ù";
		arr3[2] = "3¿ù";
		for (int i = 0; i < arr3.length; i++)
			System.out.println("arr3[" + i + "] : \t" + arr3[i]);
	}

}
