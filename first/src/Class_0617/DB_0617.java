package Class_0617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_0617 {
	/*
	 * java.sql.* => java에서 sql과 관련된 API 
	 * Connection Class => DB서버와 연결 
	 * Statment Class => 쿼리문의 실행 
	 * ResultSet Class => DB에 있는 테이블의 내용을 가져와서 저장하는 곳 프로그램에서 사용할 목적
	 * 
	 * 예외 처리
	 * public void 함수()
	 * {
	 *    실행문 : // 예외가 발생할 수 있는 문장일경우 => 예외처리 방법 서술
	 * }
	 * 1. try ~ catch문을 통해서 (예외발생시 프로그램 종료 => 프로그램이 계속실행)
	 * public void 함수()
	 * {
	 *   try
	 *   {
	 *     실행문;
	 *   }
	 *   catch(예외클래스명 변수명 e) // 예외클래스명은 실행문에서 발생예츨
	 *   {
	 *     위의 실행문에 예외가 발생했을때 실행할 문장을 서술
	 *   }
	 * 
	 * 2. throws를 통한 예외처리 
	 * public void 함수() throws 예외클래스
	 * {
	 *   실행문;  // 예외발생시 try ~ catch가 아니고 throws로 예외를 넘긴다.
	 * }
	 * 
	 * public static void main(String[] args)
	 * {
	 *   try
	 *   {
	 *     함수명();  // 메인에서 위의 함수를 호출
	 *   }
	 *   catch(예외클래스 e)
	 *   {
	 *     예외발생시 처리문장;
	 *   }
	 */
	public static void main(String[] args)
	{
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pension?useSSL=false","root","apmsetup");
		} 
		catch (SQLException e) {
			System.out.println("예외발생");
		}
	}
	}
