package InnerClass;

public class Outter {
	String field = "Outter - field";
	void method () {
		System.out.println("Outter method()");
	}
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() { //��ø Ŭ���� ����
			System.out.println(this.field);
			this.method();
			//�ٱ� ��ü ���� 
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
		
	} 
}
