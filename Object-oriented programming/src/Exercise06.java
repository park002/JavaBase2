import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0;
		int count = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("----------------------------------------------------");
			System.out.print("����>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("�л��� >");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >");
					scores[i] = Integer.parseInt(sc.nextLine());
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			} else if (selectNo == 4) {

				for (int i = 0; i < scores.length; i++) {
					max = max < scores[i] ? scores[i] : max;
					sum += scores[i];
					count++;
				}
				avg = sum / (double) count;

				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ����: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");

	}

}
