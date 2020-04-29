package _Practice;

public class Star {

	public static void main(String[] args) {
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) // 45개의 ball 의 값을 저장
			ball[i] = i + 1;

		int temp;
		int y;
		for (int i = 0; i < 6; i++) {
			y = (int) (Math.random() * 45); // 0 ~ 44 까지 45개
			temp = ball[i];
			ball[i] = ball[y];
			ball[y] = temp;
		}
		
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);

	}
}
