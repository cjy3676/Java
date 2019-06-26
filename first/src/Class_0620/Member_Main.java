package Class_0620;

import java.sql.*;
import java.util.Scanner;

public class Member_Main {

	public static void main(String[] args) throws SQLException {

		Member_DB mdb = new Member_DB();
		Scanner sc = new Scanner(System.in);
		int ch2;
		do {
			System.out.println("1. 회원출력하기");
			System.out.println("2. 회원입력하기");
			System.out.println("3. 회원수정하기");
			System.out.println("4. 회원삭제하기");
			System.out.println("5. 종료하기");

			System.out.print("무엇을 하겠습니까? ");
			ch2 = sc.nextInt();

		switch (ch2) {  
			case 1: mdb.select(); break; // 출력메소드 실행
			case 2: mdb.insert(); break; // 입력메소드 실행
			case 3: mdb.update(); break; // 수정메소드 실행
			case 4: mdb.delete(); break; // 삭제메소드 실행
			}
		} while (ch2 != 5);
	}
}
