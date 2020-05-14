package inheritance;

public class Child extends Parent {
	
	private String name;

	public Child() {
		this("ȫ�浿");
		System.out.println("chile() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");

	}
}
