package Test;

import java.util.Scanner;

public class ForeachEx {

	public static void main(String[] args) {
		int hap = 0;
		int i = 0;
		for (i = 1; i <= 5; ++i, hap += i) {
			// i=1 ==> (1<=5) (ok);
			// ���� 1 0�Դϴ�.
			// ++i ==>2
			// hap=hap+1 ==> hap=0+2 ==>hap=2;
			// ���� 2 2�Դϴ�.

			System.out.printf("���� %d %4d�Դϴ�\n", i, hap);
		}

		System.out.println();

		for (int j = 0; j <= 5; ++j) {
			System.out.print(j);
		}
	}
}
