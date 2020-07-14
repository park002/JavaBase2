package LambdaExpressions2;

public class MyFunctionExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(5, 3));

	}

	static int sum(int x, int y) {
		return x + y;
	}
}
