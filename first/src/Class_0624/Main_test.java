package Class_0624;

import java.sql.*;
import java.util.Scanner;

public class Main_test {

	public static void main(String[] args) throws SQLException {
		DB_MEM dbm = new DB_MEM();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		System.out.println("전화번호을 입력하시오");
		String phone = sc.next();
		System.out.println("나이을 입력하시오");
		int age = sc.nextInt();
		System.out.println("주소을 입력하시오");
		String juso = sc.next();
	    
		dbm.insert("name","phone",age,"juso");
	}
}
