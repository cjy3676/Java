package first;
import java.util.Scanner;
public class Test10 
{   // 10. Scanner�� ���� num1,num2��� ������ ���� ������ �� ���߿� ū���� ����Ͻÿ�
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// num1 �Է�
		System.out.println("num1�� �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		// num2 �Է�
        System.out.println("num2�� �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
		// num1, num2 ��
		if (num1>num2) 
		{
			System.out.println(num1);
		}
		else if (num1==num2) 
		{
			System.out.println("�μ��� �����ϴ�.");
		}
		else  
		{
			System.out.println(num2);
		}
	}
}
