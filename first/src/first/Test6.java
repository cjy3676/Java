package first;
import java.util.Scanner;
public class Test6 
{   // 6. ���� ������ Scanner�� �Է¹޾Ƽ� 60�� �̻��̸� "�հ��Դϴ�"�� ����ϰ� 60�� �̸��̸� "���հ��Դϴ�" ��� ����Ͻÿ�
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��Ͻÿ�.");
		
		int mat = sc.nextInt();
		
		if (mat>100) 
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else if (mat>=60) 
		{
			System.out.println("�հ��ϼ̽��ϴ�.");
		}
		else  
		{
			System.out.println("���հ��Դϴ�.");
		}
	}
}
