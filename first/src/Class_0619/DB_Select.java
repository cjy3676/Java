package Class_0619;

import java.sql.*;

public class DB_Select {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		Statement stmt = conn.createStatement();
		
		String sql = "select * from member";
		ResultSet rs = stmt.executeQuery(sql);
		
		rs.last(); // rs객체의 가장 끝으로 이동
		
		int len = rs.getRow(); // 레코드의 갯수를 len변수에 저장
		rs.first();
		for(int i=1; i<=len; i++)
		{
			System.out.printf("%10s",rs.getString("name"));
			System.out.printf("%5s",rs.getString("phone"));
			System.out.printf("%5s",rs.getString("age"));
			System.out.printf("%10s",rs.getString("juso"));
			rs.next();
			System.out.println();
		}
	}

}
