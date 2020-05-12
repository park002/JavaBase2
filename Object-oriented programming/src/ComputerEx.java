
public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cp = new Computer();
		int[] values1 = { 1, 2, 3 };
		int sum = cp.sum1(values1);
		int sum2 = cp.sum2(1, 2, 3);
		System.out.println(sum2);

		int result2 = cp.sum1(new int[] { 1, 2, 3 });
		int result3 = cp.sum2(new int[] { 1, 3, 4 });

	}

}
