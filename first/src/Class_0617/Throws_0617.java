package Class_0617;

import java.sql.*;

public class Throws_0617 {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		
		Statement stmt = conn.createStatement();
		
		String sql = "create table test(aa int)";
		
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
	}
}
