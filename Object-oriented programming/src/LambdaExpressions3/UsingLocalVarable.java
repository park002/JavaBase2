package LambdaExpressions3;

public class UsingLocalVarable {
	void method(final int arg) {
		final int localVar = 0;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.method();
		
	}
	
}
