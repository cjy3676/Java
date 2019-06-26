package Class_0617;

import java.sql.*;

public class DB_INPUT {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");

		Statement stmt = conn.createStatement();

		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('아이언맨','010-1234-5678',34,'말리부')";

		stmt.executeUpdate(sql);

		stmt.close();
		conn.close();
	}
}
