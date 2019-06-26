package Class_0624;

import java.sql.*; // 현재클래스에 접근 못하는 외부클래스일 경우

public class DB_MEM { // 클래스는 내가 만들고자 하는 기능을 모두 정의
	// 속성과 메소드 (현재 만들 기능에 필요한 변수와 함수)
	Connection conn; // 프록그래밍언어와 DB서버와의 연결
	Statement stmt; // DB서버에 쿼리를 실행할 클래스
	// 필요한 변수
    /*String name;
	String phone;
	int age; */
	
	DB_MEM() throws SQLException { // 생성자에서 DB관련 클래스 변수 생성
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	
	// 외부에서 입력된 이름, 전화번호, 나이를 가져와서 DB에 입력하는 기능
	public void insert(String name, String phone, int age) throws SQLException {
		String sql = "insert into member2(name,phone,age)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ")";

		stmt.executeUpdate(sql);
	}
	
	// 매개변수가 4개라면 member테이블에 값을 넣는 메소드를 만드시오.
	// 오버로딩 => 동일한 메소드에 매개변수의 갯수와 자료형이 틀릴경우 동일한 메소드 이름으로 정의를 하는 것
	
	public void insert(String name, String phone, int age, String juso) throws SQLException {
		String sql = "insert into member(name,phone,age,juso)";
		sql = sql + " values('" + name + "','" + phone + "'," + age + ",'"+juso+"')";

		stmt.executeUpdate(sql);
	}
}
