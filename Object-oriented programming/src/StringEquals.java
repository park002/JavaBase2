
public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "박재호";
		String value2 = "박재호";
		if (value == value2)
			System.out.println("value ,value2 는 참조가 같음");
		else
			System.out.println("value,value2 는 참조가 틀림");
		if (value.equals(value2))
			System.out.println("value , value2 는 문자열이동일함");
		else
			System.out.println("value,value2 는 문자열이 틀림");
		
		String strVar3 = new String("박재호");
		String strVar4 = new String("박재호");
		if (strVar3 != strVar4)
			System.out.println("번지수가 다를거임");
		if (strVar3.equals(strVar4))
			System.out.println("문자열이 동일");
	}

}
