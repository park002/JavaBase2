
public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "����ȣ";
		String value2 = "����ȣ";
		if (value == value2)
			System.out.println("value ,value2 �� ������ ����");
		else
			System.out.println("value,value2 �� ������ Ʋ��");
		if (value.equals(value2))
			System.out.println("value , value2 �� ���ڿ��̵�����");
		else
			System.out.println("value,value2 �� ���ڿ��� Ʋ��");
		
		String strVar3 = new String("����ȣ");
		String strVar4 = new String("����ȣ");
		if (strVar3 != strVar4)
			System.out.println("�������� �ٸ�����");
		if (strVar3.equals(strVar4))
			System.out.println("���ڿ��� ����");
	}

}
