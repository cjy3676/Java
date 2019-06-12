package first;
import java.util.Scanner;
public class cal_score 
{
	// 국어, 영어, 수학, 과학 점수
	int kor;
	int eng;
	int mat;
	int sci;
	
	// 점수 입력
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오.");
		kor=sc.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng=sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		mat=sc.nextInt();
		System.out.println("과학점수를 입력하시오.");
		sci=sc.nextInt();
	}
	
	// 입력된 과목의 점수를 수,우,미,양,가로 출력
	public void chul()
	{
		sung(kor , "국어는");
		sung(eng , "영어는");
		sung(mat , "수학는");
		sung(sci , "과학는");
	}
	
	// 입력된 점수를 호출하는 함수
	public void sung(int num , String nam)
	{
	    if (num>100) {System.out.println("잘못 입력하였습니다.");}
		else if (num>=90) {System.out.println(nam+"  수 입니다.");}
		else if (num>=80) {System.out.println(nam+"  우 입니다.");}
		else if (num>=70) {System.out.println(nam+"  미 입니다.");}
		else if (num>=60) {System.out.println(nam+"  양 입니다.");}
		else {System.out.println(nam+"  가 입니다.");}
	}
}
