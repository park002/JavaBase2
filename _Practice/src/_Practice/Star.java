package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("몇 단을 출력해볼까요? ~>");
			Scanner sc = new Scanner(System.in);
			String abc =  sc.nextLine();
			int gugu =  Integer.parseInt(abc);
			for(int i=gugu; i<=gugu; i++) {
					for(int j=1; j<=9; j++) {
			
						System.out.printf("%d x %d = %d",i,j,i*j);
						System.out.println();
					}
			}
			
	}
}
