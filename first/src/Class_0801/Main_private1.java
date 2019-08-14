package Class_0801;

import java.sql.*;

public class Main_private1 {

	public static void main(String[] args) throws SQLException {
		Cal_private1 cp1 = new Cal_private1();
		Connection conn = cp1.return_db();
		Statement stmt = conn.createStatement();
		String sql = "create table imsi(id int)";
		stmt.executeUpdate(sql);
		
		String chk = cp1.check("5678");
		System.out.println(chk);
	}

}
