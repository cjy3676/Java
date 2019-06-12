package first;
import java.util.Scanner;
public class Test_7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하시오.");
		int num = sc.nextInt();
		/* switch로 하기
		  age = age / 10;    //10부터 59까지의 값을 10으로 나누면 소수점은 버리고 정수부분만 
		  switch(age) 
		  {
		     case 1: System.out.println("스파게티"); break;
		     case 2: System.out.println("부대찌개"); break;
		     case 3: System.out.println("불닭발"); break;
		     case 4: System.out.println("참치회"); break;
		     case 5: System.out.println("주꾸미불고기"); break;
		     default: System.out.println("잘못입력하셨습니다.");  
		 */
		
		if (num>=60) 
		{
			System.out.println("잘못입력하셨습니다.");
		}
		else if (num>=50) 
		{
			System.out.println("쭈꾸미불고기");
		}
		else if (num>=40) 
		{
			System.out.println("참치회");
		}
		else if (num>=30) 
		{
			System.out.println("불닭발");
		}
		else if (num>=20) 
		{
			System.out.println("부대찌대");
		}
		else if (num>=10) 
		{
			System.out.println("스파게티");
		}
		else 
		{
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
