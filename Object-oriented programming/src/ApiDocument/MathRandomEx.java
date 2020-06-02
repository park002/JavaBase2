package ApiDocument;

public class MathRandomEx extends Test {
	public static void main(String[] args) {
		// 주사위 눈 구하기
		int b = (int) (Math.random() * 6) + 1;
		System.out.println("주사위의 눈 :" + b);
		aaaaaa();
		MathRandomEx ex = new MathRandomEx();
		System.out.println(ex.bbbbbbbbb());

	}

	@Override
	String bbbbbbbbb() {
		return "오바라이딩!~";
	}

}
