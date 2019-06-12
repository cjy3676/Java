package first;
import java.util.Scanner;
public class Test6 
{   // 6. 수학 점수를 Scanner로 입력받아서 60점 이상이면 "합격입니다"로 출력하고 60점 미만이면 "불합격입니다" 라고 출력하시오
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("수학점수를 입력하시오.");
		
		int mat = sc.nextInt();
		
		if (mat>100) 
		{
			System.out.println("잘못입력하셨습니다.");
		}
		else if (mat>=60) 
		{
			System.out.println("합격하셨습니다.");
		}
		else  
		{
			System.out.println("불합격입니다.");
		}
	}
}
