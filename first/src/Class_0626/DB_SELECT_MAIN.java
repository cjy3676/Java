package Class_0626;

import java.sql.SQLException;
import java.util.Scanner;

public class DB_SELECT_MAIN {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int num;
		DB_SELECT ds = new DB_SELECT();
		do { // while�ݺ����� ���� => ������ 1�� �����ϰ� ������ ������
			System.out.println("1. ��ü����ϱ�");
			System.out.println("2. �̸� �˻�");
			System.out.println("3. ��ȭ��ȣ �˻�");
			System.out.println("4. �ּ� �˻�");
			System.out.println("5. ����");
			num = sc.nextInt();

			// �Է°��� ���� �ʿ��� �޼ҵ� ȣ��
			switch (num) {
			case 1:
				ds.all_chul();
				break;
			case 2:
				ds.name_chul();
				break;
			case 3:
				ds.phone_chul();
				break;
			case 4:
				ds.juso_chul();
				break;
			}
		} while (num != 5); // ����ڰ� 5�� �Է��ϸ� ����
	}
}
