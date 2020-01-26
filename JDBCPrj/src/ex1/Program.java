package ex1;

import java.sql.*;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost/new";
		String sql = "select * from notice";

		Class.forName("com.mysql.jdbc.Driver"); // 드라이버 로드
		// @param getConnection(url, userName, password);
		Connection con = DriverManager.getConnection(url, "root", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) { // 현재 레코드에 값이 존재한다면 true
			int id = rs.getInt("id");
			String title = rs.getString("TITLE"); // 대소문자 구별하지 않는다 .
			String writer_id = rs.getString("writer_id");
			String content = rs.getString("content");
			Date regdate = rs.getDate("regdate");
			int hit = rs.getInt("hit");
			String Files = rs.getString("Files");
			System.out.println(title);
			System.out.println(id);
			System.out.println(writer_id);
			System.out.println(content);
			System.out.println(regdate);
			System.out.println(hit);
			System.out.println(Files);
		}
		rs.close();
		st.close();
		con.close();
	}

}
