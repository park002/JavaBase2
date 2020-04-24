package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)>");
			 Scanner sc  = new Scanner(System.in);
			 String Jumin = 	sc.nextLine();
			 char Sung = Jumin.charAt(7);
			 switch(Sung) {
			 	case '1':
				case '3':
					switch(Sung) {
						case '1': System.out.println("당신은 2000년 이전에 태어난 남자입니다");
						break;
						case '3': System.out.println("당신은 2000년 이후에 태어난 남자입니다");
					}
				 break;
				case '2':
				case '4': 
				 	switch(Sung) {
				 	case '2' : System.out.println("당신은 2000년 이전에 태어난 여자입니다");
				 	break;
				 	case '4' : System.out.println("당신은 2000년 이후에 태어난 여자 입니다");
				 }
				 	break;
				 
				 default: System.out.println("유효하지 않는 주민등록번호입니다");
			 }
	}
}
