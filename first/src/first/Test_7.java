package first;
import java.util.Scanner;
public class Test_7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̸� �Է��Ͻÿ�.");
		int num = sc.nextInt();
		/* switch�� �ϱ�
		  age = age / 10;    //10���� 59������ ���� 10���� ������ �Ҽ����� ������ �����κи� 
		  switch(age) 
		  {
		     case 1: System.out.println("���İ�Ƽ"); break;
		     case 2: System.out.println("�δ��"); break;
		     case 3: System.out.println("�Ҵ߹�"); break;
		     case 4: System.out.println("��ġȸ"); break;
		     case 5: System.out.println("�ֲٹ̺Ұ��"); break;
		     default: System.out.println("�߸��Է��ϼ̽��ϴ�.");  
		 */
		
		if (num>=60) 
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else if (num>=50) 
		{
			System.out.println("�޲ٹ̺Ұ��");
		}
		else if (num>=40) 
		{
			System.out.println("��ġȸ");
		}
		else if (num>=30) 
		{
			System.out.println("�Ҵ߹�");
		}
		else if (num>=20) 
		{
			System.out.println("�δ����");
		}
		else if (num>=10) 
		{
			System.out.println("���İ�Ƽ");
		}
		else 
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
