package inheritance;

public class A {
	protected String field;

	protected A() {
		field = "protected 접근 지정자는 같은 패키지에서 사용가능 다른패키지에서는 상속받아서 사용가능";
		System.out.println(field);
	}

	protected void method() {
	
	}
}
