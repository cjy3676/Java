package Class_0627;

import java.sql.*;
import java.util.Scanner;

public class Order_Main {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int num;
		DB_Order dr = new DB_Order(); 
		do { // while반복문의 변형 => 무조건 1번 실행하고 조건이 나오는 
			System.out.println("1. 전체출력하기");
			System.out.println("2. 이름순 출력하기");
			System.out.println("3. 전화번호 검색");
			System.out.println("4. 주소 검색");
			System.out.println("5. 종료");
			num = sc.nextInt();
			
			// 입력값에 따라 필요한 메소드 호출
			switch(num) {
			case 1: dr.select_chul(1); break;
			case 2: dr.select_chul(2); break;
			case 3: dr.select_chul(3); break;
			case 4: dr.select_chul(4); break;
			}
		} while(num != 5); // 사용자가 5를 입력하면 종료
	    dr.db_close();
	}
}
