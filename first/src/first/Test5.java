package first;
import java.util.Scanner;
public class Test5 
{   // 5. 영어점수(0~100점)를 Scanner로 입력받아서 수,우,미,양,가를 출력하시오. (90점 이상은 수, 80점이상은 우~~
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 점수를 입력하시오.");
		
		int eng = sc.nextInt();
		
		if (eng>100) 
		{
			System.out.println("잘못입력하셨습니다.");
		}
		else if (eng>=90) 
		{
			System.out.println("수");
		}
		else if (eng>=80) 
		{
			System.out.println("우");
		}
		else if (eng>=70) 
		{
			System.out.println("미");
		}
		else if (eng>=60) 
		{
			System.out.println("양");
		}
		else  
		{
			System.out.println("가");
		}
	}
}
