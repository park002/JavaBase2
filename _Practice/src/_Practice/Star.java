package _Practice;

public class Star {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int z = 0; z < array.length; z++) {
			int abc = (int) (Math.random() * 80 + 1);
			array[z] = abc;
		}

		for (int i = 0; i < array.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed)
				break;

			for (int k = 0; k < array.length; k++)
				System.out.print(array[k] + ",");
			System.out.println();
		}
	}
}
