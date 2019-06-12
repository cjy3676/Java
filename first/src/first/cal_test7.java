package first;
import java.util.Scanner;
public class cal_test7 
{
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in);
	
	public void input() 
	{
		// 국어점수 입력
		System.out.println("국어점수를 입력하시오.");
		kor = sc.nextInt();
		// 영어점수 입력
		System.out.println("영어점수를 입력하시오.");
		eng = sc.nextInt();
		// 수학점수 입력
		System.out.println("수학점수를 입력하시오.");
		mat = sc.nextInt();
	}
	
	public void sel_input() 
	{
		System.out.println("원하는 점수의 번호를 입력하시오. 1.국어 2.영어 3.수학");
		sel=sc.nextInt();
	}
	
	public void chul() 
	{
		switch(sel) 
		{
		case 1: System.out.println(kor); break;
		case 2: System.out.println(eng); break;
		case 3: System.out.println(mat); break;
		default: System.out.println("잘못입력하셨습니다.");
		}
	}
}
