package InterfacePolymorphism;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDao���� DB�� �˻�");

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDao���� DB�� ����");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDao���� DB���� ����");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySqlDao���� DB���� ����");
	}
}
