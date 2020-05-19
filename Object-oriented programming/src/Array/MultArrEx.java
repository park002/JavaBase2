package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultArrEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] o = new int[19][19];
		System.out.println("바둑판에 올려 놓을 흰돌의 개수를 입력 하세요");
		int n = sc.nextInt();
		if (n <= 10) {
			System.out.println("흰돌 " + n + " 개를 입력했습니다");
			for (int i = 1; i <= n; i++) {
				System.out.println(i + "번째 행 과 열 을 입력해주세요");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.printf("%d,%d\n", x, y);
				
				if (o[x][y] == 1) {
					System.out.println("이미 흰 돌을 놓은 좌표입니다");
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
			System.out.println("10이하의 자연수만 입력해주세요");
		}
	}

}
