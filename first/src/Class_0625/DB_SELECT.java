package Class_0625;

import java.sql.*;
import java.util.Scanner;

public class DB_SELECT { // �˻��� �Ҷ� ����(where��), ����(order by)
	// ���� Ŭ���������� �����ϱ� ���� �Ӽ�(����)
	Connection conn; // ��ü������ �ؾ� �ȴ� => �����ڿ��� ��ü����
	Statement stmt;
	ResultSet rs;
	String sql;
	Scanner sc;
	// Ŭ�������� �ʱ�ȭ�� ���� �����ڳ��� �ڵ�
	DB_SELECT() throws SQLException
	{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		sc = new Scanner(System.in);
	}
	// ��ü����ϱ�
	public void all_chul() throws SQLException
	{
		sql = "select * from member";
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.printf("%5s", rs.getString("name"));
			System.out.printf("%13s", rs.getString("phone"));
			System.out.printf("%3s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			System.out.println();
		}
	}
	// �̸��˻�
	public void name_chul() throws SQLException
	{
		System.out.println("�˻��� �̸��� �Է��ϼ���");
		String name = sc.next();
		sql = "select * from member where name='"+name+"'";
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.printf("%5s", rs.getString("name"));
			System.out.printf("%13s", rs.getString("phone"));
			System.out.printf("%3s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			System.out.println();
		}
	}
	// ��ȭ��ȣ�˻�
	public void phone_chul() throws SQLException
	{
		System.out.println("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
		String phone = sc.next();
		sql = "select * from member where phone='"+phone+"'";
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.printf("%5s", rs.getString("name"));
			System.out.printf("%13s", rs.getString("phone"));
			System.out.printf("%3s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			System.out.println();
		}
	}
	// �ּҰ˻�
	public void juso_chul() throws SQLException
	{
		System.out.println("�˻��� �ּҸ� �Է��ϼ���");
		String juso = sc.next();
		sql = "select * from member where juso='"+juso+"'";
		rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.printf("%5s", rs.getString("name"));
			System.out.printf("%13s", rs.getString("phone"));
			System.out.printf("%3s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			System.out.println();
		}
	}
}
