package Class_0626;

import java.sql.*;
import java.util.Scanner;

public class DB_SELECT2 { // 검색을 할때 조건(where문), 정렬(order by)
	// 현재 클래스내에서 동작하기 위한 속성(변수)
	Connection conn; // 객체생성을 해야 된다 => 생성자에서 객체생성
	Statement stmt;
	ResultSet rs;
	String sql;
	Scanner sc;

	// 클래스변수 초기화를 위한 생성자내에 코딩
	DB_SELECT2() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		sc = new Scanner(System.in);
	}

	public void total_chul(int num) throws SQLException {
		switch (num) {
		case 1: // 전체출력하기
			sql = "select * from member";
			break;
		case 2: // 이름검색
			System.out.println("검색할 이름을 입력하세요");
			String name = sc.next();
			sql = "select * from member where name='" + name + "'";
		case 3: // 전화번호검색
			System.out.println("검색할 전화번호를 입력하세요");
			String phone = sc.next();
			sql = "select * from member where phone='" + phone + "'";
		case 4: // 주소검색
			System.out.println("검색할 주소를 입력하세요");
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