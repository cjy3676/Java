package Class_0617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_0617 {
	/*
	 * java.sql.* => java���� sql�� ���õ� API 
	 * Connection Class => DB������ ���� 
	 * Statment Class => �������� ���� 
	 * ResultSet Class => DB�� �ִ� ���̺��� ������ �����ͼ� �����ϴ� �� ���α׷����� ����� ����
	 * 
	 * ���� ó��
	 * public void �Լ�()
	 * {
	 *    ���๮ : // ���ܰ� �߻��� �� �ִ� �����ϰ�� => ����ó�� ��� ����
	 * }
	 * 1. try ~ catch���� ���ؼ� (���ܹ߻��� ���α׷� ���� => ���α׷��� ��ӽ���)
	 * public void �Լ�()
	 * {
	 *   try
	 *   {
	 *     ���๮;
	 *   }
	 *   catch(����Ŭ������ ������ e) // ����Ŭ�������� ���๮���� �߻�����
	 *   {
	 *     ���� ���๮�� ���ܰ� �߻������� ������ ������ ����
	 *   }
	 * 
	 * 2. throws�� ���� ����ó�� 
	 * public void �Լ�() throws ����Ŭ����
	 * {
	 *   ���๮;  // ���ܹ߻��� try ~ catch�� �ƴϰ� throws�� ���ܸ� �ѱ��.
	 * }
	 * 
	 * public static void main(String[] args)
	 * {
	 *   try
	 *   {
	 *     �Լ���();  // ���ο��� ���� �Լ��� ȣ��
	 *   }
	 *   catch(����Ŭ���� e)
	 *   {
	 *     ���ܹ߻��� ó������;
	 *   }
	 */
	public static void main(String[] args)
	{
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pension?useSSL=false","root","apmsetup");
		} 
		catch (SQLException e) {
			System.out.println("���ܹ߻�");
		}
	}
	}
