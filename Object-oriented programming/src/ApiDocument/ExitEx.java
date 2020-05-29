package ApiDocument;

public class ExitEx {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				System.exit(0);
			//break;
		}
		System.out.println("마무리 코드");
	}

}
