package first;
import java.util.Scanner;
public class Test8 
{   // 8. 7번 문제에서 각 과목 점수대신 수,우,미,양,가를 출력하시오.
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 국어점수 입력
		System.out.println("국어점수를 입력하시오.");
		int kor = sc.nextInt();
		// 영어점수 입력
		System.out.println("영어점수를 입력하시오.");
		int eng = sc.nextInt();
		// 수학점수 입력
		System.out.println("수학점수를 입력하시오.");
		int mat = sc.nextInt();
		// 번호 입력
		System.out.println("원하는 점수의 번호를 입력하시오. 1.국어 2.영어 3.수학");
		int swi = sc.nextInt();
		// 번호에 맞는 점수의 수,우,미,양,가 출력
		switch(swi) 
		{
		case 1: 
		{
			System.out.print("국어는 ");
			if (kor>=90) {System.out.println("수 입니다.");}
			else if (kor>=80) {System.out.println("우 입니다.");}
			else if (kor>=70) {System.out.println("미 입니다.");}
			else if (kor>=60) {System.out.println("양 입니다.");}
			else {System.out.println("가 입니다.");}
		} break;
		case 2: 
		{
			System.out.print("영어는 ");
			if (eng>=90) {System.out.println("수 입니다.");}
			else if (eng>=80) {System.out.println("우 입니다.");}
			else if (eng>=70) {System.out.println("미 입니다.");}
			else if (eng>=60) {System.out.println("양 입니다.");}
			else {System.out.println("가 입니다.");}
		} break;	
		case 3:
		{
			System.out.print("수학는 ");
			if (mat>=90) {System.out.println("수 입니다.");}
			else if (mat>=80) {System.out.println("우 입니다");}
			else if (mat>=70) {System.out.println("미 입니다");}
			else if (mat>=60) {System.out.println("양 입니다");}
			else {System.out.println("가 입니다.");}
		} break;
		default: System.out.println("잘못입력하셨습니다.");
		}
    }
}
