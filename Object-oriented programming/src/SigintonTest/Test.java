package SigintonTest;

public class Test {

	private static final Test test = new Test();

	private Test() {
		System.out.println("�����ٷ� �̱���");
	}

	public static Test getInstance() {
		return test;
	}
	public String abc() {
		return "�̱��� �׽�Ʈ";
	}

}
