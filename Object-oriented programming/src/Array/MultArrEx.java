package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultArrEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] o = new int[19][19];
		System.out.println("�ٵ��ǿ� �÷� ���� ���� ������ �Է� �ϼ���");
		int n = sc.nextInt();
		if (n <= 10) {
			System.out.println("�� " + n + " ���� �Է��߽��ϴ�");
			for (int i = 1; i <= n; i++) {
				System.out.println(i + "��° �� �� �� �� �Է����ּ���");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.printf("%d,%d\n", x, y);
				
				if (o[x][y] == 1) {
					System.out.println("�̹� �� ���� ���� ��ǥ�Դϴ�");
					i--;
					continue;
				}
				o[x][y] = 1;
			}

			for (int i = 1; i < o.length; i++) {
				for (int j = 1; j < o[i].length; j++) {
					System.out.print(o[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("10������ �ڿ����� �Է����ּ���");
		}
	}

}
