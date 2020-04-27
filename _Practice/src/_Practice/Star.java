package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴를 선택하세요 (1~3) 종료:(0) >");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘 못선택하셨습니다 종료는 0 입니다");
				continue;
			}

			for (;;) { // 선택 잘했으면 여기로온다
				System.out.print("계산 할 값을 입력하세요.(계산종료:0,전체 종료:99)>");
				tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp);
				if (num == 0)
					break;
				if (num == 99)
					break outer; // 전체종료
				switch (menu) {
				case 1:
					System.out.println("result=>" + num * num);
					break;
				case 2:
					System.out.println("result=>" + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result=>" + Math.log(num));
					break;
				}

			}

		}

	}
}
