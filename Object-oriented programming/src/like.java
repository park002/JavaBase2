
public class like {

	private static int likeSu;

	private like() {
		this.likeSu++;
		System.out.println("���ƿ� �� " + this.likeSu);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		like li = new like();
		like li2 = new like();
	}

}
