package first;
import java.util.Scanner;
public class Test5 
{   // 5. ��������(0~100��)�� Scanner�� �Է¹޾Ƽ� ��,��,��,��,���� ����Ͻÿ�. (90�� �̻��� ��, 80���̻��� ��~~
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ�.");
		
		int eng = sc.nextInt();
		
		if (eng>100) 
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		else if (eng>=90) 
		{
			System.out.println("��");
		}
		else if (eng>=80) 
		{
			System.out.println("��");
		}
		else if (eng>=70) 
		{
			System.out.println("��");
		}
		else if (eng>=60) 
		{
			System.out.println("��");
		}
		else  
		{
			System.out.println("��");
		}
	}
}
