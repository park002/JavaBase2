package _Practice;

import java.util.Random;
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���>");
		String input =sc.nextLine();
		ch = input.charAt(0);
		if('0'<=ch && ch<='9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		else if (('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
			
		}
		
		

	}
   

}
