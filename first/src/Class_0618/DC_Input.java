package Class_0618;

import java.sql.*;
import java.util.Scanner;

public class DC_Input {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		Statement stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�");
		String phone = sc.next();
		System.out.println("������ �Է��Ͻÿ�");
		String age = sc.next();
        System.out.println("�ּ��� �Է��Ͻÿ�");
        String juso = sc.next();
		
		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('"+name+"','"+phone+"',"+age+",'"+juso+"')";
		
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
	}

}
