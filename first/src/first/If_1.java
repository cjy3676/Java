package first;
import java.util.Scanner;
public class If_1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		if(age >= 20)
		{
			System.out.println("�����ϼ���");
		}
		else 
		{
			System.out.println("������ �ٽ� ������");
		}
	}

}
