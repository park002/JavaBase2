
public class MemberServiceimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService member = new MemberService();
		boolean result = member.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			member.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		}
	}

}
