package first;
import java.util.Scanner;
public class sung 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��Ͻÿ�.");
		for(int i=1; i<=3; i++)
		{
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("����� "+((num+num2+num3)/3)+"�� �Դϴ�.");
		}
	}
}
