package first;
import java.util.Scanner;
public class NCS_test5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4�� ���ڸ� �Է��Ͻÿ�");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1: System.out.println("¥���"); break;
		case 2: System.out.println("�쵿"); break;
		case 3: System.out.println("«��"); break;
		case 4: System.out.println("������"); break;
		}
	}
}
