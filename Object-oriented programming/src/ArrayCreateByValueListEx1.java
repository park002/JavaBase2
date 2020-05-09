
public class ArrayCreateByValueListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d%n", i, scores[i]);
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		float avg = (float) sum / 3;
		System.out.println("Æò±Õ : " + avg);

	}

}
