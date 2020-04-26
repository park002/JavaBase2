package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		boolean flag = true;
		String tmp;
		System.out.println("합계를 구할 숫자를 입력하세요 (끝내려면 0 을 입력하세요).");
		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println(">>");
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			if (num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println("합계:" + sum);

	}
}
