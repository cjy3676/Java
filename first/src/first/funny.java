package first;
import java.util.Scanner;
public class funny 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����ϰ� �п��� ���� ����?");
		sc.next();
		String sum = sc.next();
		
		if (sum.equals("�����Ϸ�")) 
		{
			System.out.println("�����ξ� �����Ϸ�");
		}
		else if (sum.equals("����ļ�")) 
		{
			System.out.println("���� �μ���!");
		}
		else 
		{
			System.out.println("������ �ƴմϴ�!");
		}
	}
}
