
public class ArrayCreateByValueListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++)
			sum1 += scores[i];
		System.out.println("���� : " + sum1);

		int sum2 = add(new int[] { 89, 90, 55 });
		System.out.println("���� : " + sum2);
	}

	public static int add(int[] bb) { // ������ ����ؼ� �����ϴ� Ŭ���� �޼ҵ�
		int sum = 0;
		for (int i = 0; i < bb.length; i++) {
			sum += bb[i];
		}
		return sum;
	}

}
