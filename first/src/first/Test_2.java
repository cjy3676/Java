package first;
import java.util.Scanner;
public class Test_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 점수 입력
		System.out.println("국어, 영어, 수학 점수를 입력하시오");
		// 국어 점수 입력
		System.out.print("국어:");
		int kor = sc.nextInt();
		// 영어 점수 입력
		System.out.print("영어:");
		int eng = sc.nextInt();
		// 수학 점수 입력
		System.out.print("수학:");
		int mat = sc.nextInt();
		// 합계 출력
		int hap = kor+eng+mat;
		System.out.println("합계:"+hap);
		// 평균 출력
		int avg = hap/3;
		System.out.println("평균:"+avg);
	}
}
