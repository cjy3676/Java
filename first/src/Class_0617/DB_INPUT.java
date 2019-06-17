package Class_0617;

import java.sql.*;

public class DB_INPUT {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","apmsetup");
		
		Statement stmt = conn.createStatement();
		
		String sql = 
	}
}
