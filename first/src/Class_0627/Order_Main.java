package Class_0627;

import java.sql.*;
import java.util.Scanner;

public class Order_Main {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int num;
		DB_Order dr = new DB_Order(); 
		do { // while�ݺ����� ���� => ������ 1�� �����ϰ� ������ ������ 
			System.out.println("1. ��ü����ϱ�");
			System.out.println("2. �̸��� ����ϱ�");
			System.out.println("3. ��ȭ��ȣ �˻�");
			System.out.println("4. �ּ� �˻�");
			System.out.println("5. ����");
			num = sc.nextInt();
			
			// �Է°��� ���� �ʿ��� �޼ҵ� ȣ��
			switch(num) {
			case 1: dr.select_chul(1); break;
			case 2: dr.select_chul(2); break;
			case 3: dr.select_chul(3); break;
			case 4: dr.select_chul(4); break;
			}
		} while(num != 5); // ����ڰ� 5�� �Է��ϸ� ����
	    dr.db_close();
	}
}
