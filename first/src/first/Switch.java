package first;
import java.util.Scanner;
public class Switch 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͻÿ�");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("1.+ 2.- 3.* 4./");
		int sel = sc.nextInt();
		
		switch(sel)
		{
		case 1: System.out.println(a+b); break;
		case 2: System.out.println(a-b); break;
		case 3: System.out.println(a*b); break;
		case 4: System.out.println(a/b); break;
		default: System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
		}

	}

}
