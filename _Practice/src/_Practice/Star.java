package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		boolean flag = true;
		String tmp;
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ��� (�������� 0 �� �Է��ϼ���).");
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
		System.out.println("�հ�:" + sum);

	}
}
