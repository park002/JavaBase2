import java.util.Arrays;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 100, 98, 55, 6, 85 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
		int sum = 0;
		for (int jumsu : scores) {
			sum += jumsu;
		}
		System.out.println(sum);
	}

}
