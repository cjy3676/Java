package first;
import java.util.Scanner;
public class If_3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("���ڸ� �Է��Ͻÿ� 1.+ 2.- 3.* 4./");
		int S = sc.nextInt();
		
		if(S==1) 
		{ 
			System.out.println(num+num2);
		}
		else if(S==2)
		{ 
			System.out.println(num-num2);
		}
		else if(S==3)
		{ 
			System.out.println(num*num2);
		}
		else if(S==4)
		{ 
			System.out.println(num/num2);
		}
		else 
		{
			System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
		}
	}

}
