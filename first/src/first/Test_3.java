package first;
import java.util.Scanner;
public class Test_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��Ͻÿ�");
		// ����
		System.out.print("����:");
		int kor = sc.nextInt();
		// ����
		System.out.print("����:");
		int eng = sc.nextInt();
		// ����
		System.out.print("����:");
		int mat = sc.nextInt();
		// ���
		int avg = (kor+eng+mat)/3;
		System.out.println("����� "+avg+"�� �Դϴ�");
		if (avg>=60) 
		{
	      System.out.println("�����մϴ�.");
		}
		else 
		{
		  System.out.println("���հ��Դϴ�.");	
		}
	}
}
