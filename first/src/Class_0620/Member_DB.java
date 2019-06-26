package Class_0620;

import java.sql.*;
import java.util.Scanner;

public class Member_DB { // member���̺���� �˻�, �Է�, ����, ����
	Connection conn;
	Statement stmt;
	Scanner sc; // Ŭ������ �ɹ������� ����

	Member_DB() throws SQLException { // ��ü���������� �����ڸ� ���ؼ�
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		sc = new Scanner(System.in);
	}

	public void insert() throws SQLException {
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�");
		String phone = sc.next();
		System.out.println("������ �Է��Ͻÿ�");
		String age = sc.next();
		System.out.println("�ּ��� �Է��Ͻÿ�");
		String juso = sc.next();

		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ",'" + juso + "')";

		stmt.executeUpdate(sql);
	}

	public void select() throws SQLException {
		String sql = "select * from member";
		ResultSet rs = stmt.executeQuery(sql);

		rs.last(); // rs��ü�� ���� ������ �̵�

		int len = rs.getRow(); // ���ڵ��� ������ len������ ����
		rs.first();
		for (int i = 1; i <= len; i++) {
			System.out.printf("%3s", rs.getString("id"));
			System.out.printf("%10s", rs.getString("name"));
			System.out.printf("%5s", rs.getString("phone"));
			System.out.printf("%5s", rs.getString("age"));
			System.out.printf("%10s", rs.getString("juso"));
			rs.next();
			System.out.println();
		}
	}

	public void update() throws SQLException {
		System.out.println("������ ���ڵ��� id�� �Է��ϼ���");
		int id = sc.nextInt();
		System.out.println("1�� �̸�, 2�� ��ȭ��ȣ, 3�� ����, 4�� �ּ�");
		int ch = sc.nextInt();
		System.out.println("������ ���� �Է��Ͻÿ�");
		String chg = sc.next();

		String ppp = "";

	switch (ch) {
		case 1: ppp = "name='" + chg + "'"; break; // name='�̸�'
		case 2: ppp = "phone='" + chg + "'"; break; // phone='�̸�'
		case 3: ppp = "age='" + chg + "'"; break; // age='�̸�'
		case 4: ppp = "juso='" + chg + "'"; break; // juso='�̸�'
		}
		if (ppp.length() != 0) {
			String sql = "update member set " + ppp + " where id=" + id;
			stmt.executeUpdate(sql);
		}
	}

	public void delete() throws SQLException {
		System.out.print("������ ���ڵ��� id�� �Է��ϼ���: ");
		// ������ ���ڵ��� id�� �Է¹޴´�.
		int id = sc.nextInt();
		// ������ �������� �ۼ�
		String sql = "delete from member where id=" + id;
		// ���� ����
		stmt.executeUpdate(sql);
	}
}
