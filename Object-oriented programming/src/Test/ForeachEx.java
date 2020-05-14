package Test;

import java.util.Scanner;

public class ForeachEx {

	public static void main(String[] args) {
		int hap = 0;
		int i = 0;
		for (i = 1; i <= 5; ++i, hap += i) {
			// i=1 ==> (1<=5) (ok);
			// 합은 1 0입니다.
			// ++i ==>2
			// hap=hap+1 ==> hap=0+2 ==>hap=2;
			// 합은 2 2입니다.

			System.out.printf("합은 %d %4d입니다\n", i, hap);
		}

		System.out.println();

		for (int j = 0; j <= 5; ++j) {
			System.out.print(j);
		}
	}
}
