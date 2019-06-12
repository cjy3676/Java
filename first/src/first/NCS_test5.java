package first;
import java.util.Scanner;
public class NCS_test5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4의 숫자를 입력하시오");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1: System.out.println("짜장면"); break;
		case 2: System.out.println("우동"); break;
		case 3: System.out.println("짬뽕"); break;
		case 4: System.out.println("탕수육"); break;
		}
	}
}
