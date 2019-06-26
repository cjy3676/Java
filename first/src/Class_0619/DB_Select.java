package Class_0619;

import java.sql.*;

public class DB_Select {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		Statement stmt = conn.createStatement();
		
		String sql = "select * from member";
		ResultSet rs = stmt.executeQuery(sql);
		
		rs.last(); // rs��ü�� ���� ������ �̵�
		
		int len = rs.getRow(); // ���ڵ��� ������ len������ ����
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
