
public class Member {
	private String name;
	private String id;

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member("ȫ�浿", "hong");
		System.out.println(mem.name);
		System.out.println(mem.id);
	}

}
