package ApiDocument;

public class Member {
	public String id; // obj2 == blue
						// obj3 == red

	Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { // �Ű����� �ڵ�����ȯ
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
