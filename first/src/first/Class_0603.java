package first;
import java.util.Date;
public class Class_0603 
{
	public static void main(String[] args) 
	{
		// ���Կ����ڸ� ���� �����ʿ� �ִ� ���� �������� �� ���
		int a = 99; // ����
		int b = a; // a��� ������ ������ �ִ� ���� ������ ������ ����
		
		// �迭
		int[] kor = new int[3];
		kor[0] = 100;
		kor[1] = 99;
		kor[2] = 88;
		int[] kkk = kor;
		System.out.println(kkk[1]);
		
		// ��ü
		Date today = new Date();
		System.out.println(today.getDate());

		Date ttt = today;
		System.out.println(ttt.getDate());
		
		String phone = "010-1234-5678";
		String[] pho = phone.split("-");
		// pho�迭�� "-"���ڸ� �������� �ڸ� ������ �ڸ� ������ 0�ε������� ���ʷ�

		System.out.println(pho[0]);
		System.out.println(pho[1]);
		System.out.println(pho[2]);

		/*
		 * int a = phone.indexOf("-"); int b = phone.lastIndexOf("-");
		 * 
		 * String first = phone.substring(0, a); String second = phone.substring(a + 1,
		 * b); String third = phone.substring(b + 1);
		 * 
		 * System.out.println(first + " " + second + " " + third);
		 */
	}
}
