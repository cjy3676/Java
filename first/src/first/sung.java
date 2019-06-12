package first;
import java.util.Scanner;
public class sung 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하시오.");
		for(int i=1; i<=3; i++)
		{
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("평균은 "+((num+num2+num3)/3)+"점 입니다.");
		}
	}
}
