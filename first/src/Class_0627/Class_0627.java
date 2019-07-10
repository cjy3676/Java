package Class_0627;
import java.sql.*;
import java.util.Scanner;
public class Class_0627 {
	
	public static void main(String[] args) throws SQLException {
		Connection conn;
		Statement stmt;
		String sql;
		ResultSet rs;
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		
		sql = "select * from member";
		rs = stmt.executeQuery(sql);
		System.out.println(rs.getString("name"));
	}

}
