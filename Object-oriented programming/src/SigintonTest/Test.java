package SigintonTest;

public class Test {

	private static final Test test = new Test();

	private Test() {
		System.out.println("³»°¡¹Ù·Î ½Ì±ÛÅæ");
	}

	public static Test getInstance() {
		return test;
	}
	public String abc() {
		return "½Ì±ÛÅæ Å×½ºÆ®";
	}

}
