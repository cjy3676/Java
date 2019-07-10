package Class_0626;

import java.sql.*;
import java.util.Scanner;

public class DB_SELECT2 { // �˻��� �Ҷ� ����(where��), ����(order by)
	// ���� Ŭ���������� �����ϱ� ���� �Ӽ�(����)
	Connection conn; // ��ü������ �ؾ� �ȴ� => �����ڿ��� ��ü����
	Statement stmt;
	ResultSet rs;
	String sql;
	Scanner sc;

	// Ŭ�������� �ʱ�ȭ�� ���� �����ڳ��� �ڵ�
	DB_SELECT2() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		sc = new Scanner(System.in);
	}

	public void total_chul(int num) throws SQLException {
		switch (num) {
		case 1: // ��ü����ϱ�
			sql = "select * from member";
			break;
		case 2: // �̸��˻�
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			String name = sc.next();
			sql = "select * from member where name='" + name + "'";
		case 3: // ��ȭ��ȣ�˻�
			System.out.println("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
			String phone = sc.next();
			sql = "select * from member where phone='" + phone + "'";
		case 4: // �ּҰ˻�
			System.out.println("�˻��� �ּҸ� �Է��ϼ���");
			String juso = sc.next();
			sql = "select * from member where juso='" + juso + "'";
		}
		chul(sql);
	}

	public void chul(String sql) throws SQLException {
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.printf("%5s", rs.getString("name"));
			System.out.printf("%13s", rs.getString("phone"));
			System.out.printf("%3s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			System.out.println();
		}
	}
}