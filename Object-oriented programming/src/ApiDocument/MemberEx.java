package ApiDocument;

public class MemberEx {
	public static void main(String[] args) {

		Member obj1 = new Member("blue"); // 100번지
		Member obj2 = new Member("blue"); // 200번지
		Member obj3 = new Member("red"); // 300번지

		if (obj1.equals(obj2)) {
			System.out.println("obj1 obj2 는 동일합니다");
		} else {
			System.out.println("obj1과 obj2는 동일하지 않습니다");
		}
		if (obj2.equals(obj3)) { // 매개 값이 member 타입이지만 id 필드값이 다르므로 false
			System.out.println("obj2 obj3 은 동일합니다");
		} else {
			System.out.println("obj2과 obj3는 동일하지 않습니다");
		}

	}
}
