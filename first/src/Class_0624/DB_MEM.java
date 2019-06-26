package Class_0624;

import java.sql.*; // ����Ŭ������ ���� ���ϴ� �ܺ�Ŭ������ ���

public class DB_MEM { // Ŭ������ ���� ������� �ϴ� ����� ��� ����
	// �Ӽ��� �޼ҵ� (���� ���� ��ɿ� �ʿ��� ������ �Լ�)
	Connection conn; // ���ϱ׷��־��� DB�������� ����
	Statement stmt; // DB������ ������ ������ Ŭ����
	// �ʿ��� ����
    /*String name;
	String phone;
	int age; */
	
	DB_MEM() throws SQLException { // �����ڿ��� DB���� Ŭ���� ���� ����
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	
	// �ܺο��� �Էµ� �̸�, ��ȭ��ȣ, ���̸� �����ͼ� DB�� �Է��ϴ� ���
	public void insert(String name, String phone, int age) throws SQLException {
		String sql = "insert into member2(name,phone,age)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ")";

		stmt.executeUpdate(sql);
	}
	
	// �Ű������� 4����� member���̺� ���� �ִ� �޼ҵ带 ����ÿ�.
	// �����ε� => ������ �޼ҵ忡 �Ű������� ������ �ڷ����� Ʋ����� ������ �޼ҵ� �̸����� ���Ǹ� �ϴ� ��
	
	public void insert(String name, String phone, int age, String juso) throws SQLException {
		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ",'"+juso+"')";

		stmt.executeUpdate(sql);
	}
}
