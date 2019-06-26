package Class_0620;

import java.sql.*;
import java.util.Scanner;

public class Member_DB { // member테이블과의 검색, 입력, 삭제, 수정
	Connection conn;
	Statement stmt;
	Scanner sc; // 클래스의 맴버변수를 정의

	Member_DB() throws SQLException { // 객체변수생성은 생성자를 통해서
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
		sc = new Scanner(System.in);
	}

	public void insert() throws SQLException {
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		System.out.println("전화번호을 입력하시오");
		String phone = sc.next();
		System.out.println("나이을 입력하시오");
		String age = sc.next();
		System.out.println("주소을 입력하시오");
		String juso = sc.next();

		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ",'" + juso + "')";

		stmt.executeUpdate(sql);
	}

	public void select() throws SQLException {
		String sql = "select * from member";
		ResultSet rs = stmt.executeQuery(sql);

		rs.last(); // rs객체의 가장 끝으로 이동

		int len = rs.getRow(); // 레코드의 갯수를 len변수에 저장
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
		System.out.println("수정할 레코드의 id를 입력하세요");
		int id = sc.nextInt();
		System.out.println("1은 이름, 2는 전화번호, 3은 나이, 4는 주소");
		int ch = sc.nextInt();
		System.out.println("수정할 값을 입력하시오");
		String chg = sc.next();

		String ppp = "";

	switch (ch) {
		case 1: ppp = "name='" + chg + "'"; break; // name='이름'
		case 2: ppp = "phone='" + chg + "'"; break; // phone='이름'
		case 3: ppp = "age='" + chg + "'"; break; // age='이름'
		case 4: ppp = "juso='" + chg + "'"; break; // juso='이름'
		}
		if (ppp.length() != 0) {
			String sql = "update member set " + ppp + " where id=" + id;
			stmt.executeUpdate(sql);
		}
	}

	public void delete() throws SQLException {
		System.out.print("삭제할 레코드의 id를 입력하세요: ");
		// 삭제할 레코드의 id를 입력받는다.
		int id = sc.nextInt();
		// 삭제할 쿼리문을 작성
		String sql = "delete from member where id=" + id;
		// 쿼리 실행
		stmt.executeUpdate(sql);
	}
}
