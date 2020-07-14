package LambdaExpressions;

public class MyFunctionExample {
	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		fi = () -> {
			String str = "method - call1";
			System.out.println(str);
		};
		fi.method();

		fi = () -> System.out.println("method-  call2 ");
		fi.method();

		fi = new MyFunctionalInterface() { // 익명구현객체
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("method-call3");
			}
		};
		fi.method();

	}
}
