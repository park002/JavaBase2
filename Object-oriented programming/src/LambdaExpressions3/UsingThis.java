package LambdaExpressions3;

public class UsingThis {

	int field = 10;

	class inner {
		int field = 20;

		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField =" + UsingThis.this.field);
				System.out.println("innerField=" + this.field);
			};
			fi.method();
		}

	}
}
