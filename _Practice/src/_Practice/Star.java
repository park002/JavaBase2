package _Practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 System.out.println("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
			 Scanner sc  = new Scanner(System.in);
			 String Jumin = 	sc.nextLine();
			 char Sung = Jumin.charAt(7);
			 switch(Sung) {
			 	case '1':
				case '3':
					switch(Sung) {
						case '1': System.out.println("����� 2000�� ������ �¾ �����Դϴ�");
						break;
						case '3': System.out.println("����� 2000�� ���Ŀ� �¾ �����Դϴ�");
					}
				 break;
				case '2':
				case '4': 
				 	switch(Sung) {
				 	case '2' : System.out.println("����� 2000�� ������ �¾ �����Դϴ�");
				 	break;
				 	case '4' : System.out.println("����� 2000�� ���Ŀ� �¾ ���� �Դϴ�");
				 }
				 	break;
				 
				 default: System.out.println("��ȿ���� �ʴ� �ֹε�Ϲ�ȣ�Դϴ�");
			 }
	}
}
