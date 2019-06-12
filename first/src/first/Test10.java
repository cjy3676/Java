package first;
import java.util.Scanner;
public class Test10 
{   // 10. Scanner를 통해 num1,num2라는 변수에 값을 저장한 후 둘중에 큰수를 출력하시오
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// num1 입력
		System.out.println("num1을 입력하시오.");
		int num1 = sc.nextInt();
		// num2 입력
        System.out.println("num2을 입력하시오.");
		int num2 = sc.nextInt();
		// num1, num2 비교
		if (num1>num2) 
		{
			System.out.println(num1);
		}
		else if (num1==num2) 
		{
			System.out.println("두수는 같습니다.");
		}
		else  
		{
			System.out.println(num2);
		}
	}
}
