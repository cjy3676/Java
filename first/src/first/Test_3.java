package first;
import java.util.Scanner;
public class Test_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하시오");
		// 국어
		System.out.print("국어:");
		int kor = sc.nextInt();
		// 영어
		System.out.print("영어:");
		int eng = sc.nextInt();
		// 수학
		System.out.print("수학:");
		int mat = sc.nextInt();
		// 평균
		int avg = (kor+eng+mat)/3;
		System.out.println("평균은 "+avg+"점 입니다");
		if (avg>=60) 
		{
	      System.out.println("축하합니다.");
		}
		else 
		{
		  System.out.println("불합격입니다.");	
		}
	}
}
