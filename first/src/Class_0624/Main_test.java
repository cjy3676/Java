package Class_0624;

import java.sql.*;
import java.util.Scanner;

public class Main_test {

	public static void main(String[] args) throws SQLException {
		DB_MEM dbm = new DB_MEM();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�");
		String phone = sc.next();
		System.out.println("������ �Է��Ͻÿ�");
		int age = sc.nextInt();
		System.out.println("�ּ��� �Է��Ͻÿ�");
		String juso = sc.next();
	    
		dbm.insert("name","phone",age,"juso");
	}
}
