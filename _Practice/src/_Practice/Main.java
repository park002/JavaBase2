package _Practice;

import java.util.Scanner;

public class Main {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // H => 10
		int M = sc.nextInt(); // M => 10

		if (M >= 45) {
			System.out.printf("%d %d", H, M - 45);
		} else if (H == 0) { // 0
			System.out.printf("%d %d", 23, M + 60 - 45);
		} else {
			System.out.printf("%d %d", H - 1, M + 60 - 45);
		}

	}
}
