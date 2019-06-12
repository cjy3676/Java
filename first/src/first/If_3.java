package first;
import java.util.Scanner;
public class If_3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력하시오 1.+ 2.- 3.* 4./");
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
			System.out.println("숫자를 잘못입력하셨습니다.");
		}
	}

}
