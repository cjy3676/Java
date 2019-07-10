package Class_0627;
import java.sql.*;
public class DB_Order {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	DB_Order() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	public void select_chul(int num) throws SQLException {
		switch(num) {
		case 1: chul("id"); break;
		case 2: chul("name"); break;
		case 3: chul("age"); break;
		case 4: chul("juso"); break;
		}
	}
	public void chul(String n) throws SQLException {
		sql = "select * from member order by "+n+"asc";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%5s",rs.getString("name"));
			System.out.printf("%15s",rs.getString("phone"));
			System.out.printf("%5s",rs.getString("age"));
			System.out.printf("%15s",rs.getString("juso"));
			System.out.println();
		}
	}
	public void db_close() throws SQLException {
		stmt.close();
		conn.close();
	}
}
