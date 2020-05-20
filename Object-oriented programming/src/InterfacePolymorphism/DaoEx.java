package InterfacePolymorphism;

public class DaoEx {

	public static void DB(DataAccessObject DAO) {
		DAO.select();
		DAO.insert();
		DAO.update();
		DAO.delete();
	}

	public static void main(String[] args) {
		DB(new OracleDao());
		DB(new MySqlDao());
	}
}
