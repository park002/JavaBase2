package InterfacePolymorphism;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("OracleDao에서 DB에 검색");

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("OracleDao에서 DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("OracleDao에서 DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("OracleDao에서 DB에서 삭제");
	}

}
