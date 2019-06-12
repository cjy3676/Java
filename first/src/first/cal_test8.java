package first;
import java.util.Scanner;

public class cal_test8 
{
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("국어점수를 입력하시오.");
		kor=sc.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng=sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		mat=sc.nextInt();
	}
	
	public void sel_input()
	{
		System.out.println("원하는 점수의 번호를 입력하시오. 1.국어 2.영어 3.수학");
		sel = sc.nextInt();
	}
	 
	public void sung_chul(int num) 
	{
		if (num>=90) {System.out.println("수 입니다.");}
		else if (num>=80) {System.out.println("우 입니다.");}
		else if (num>=70) {System.out.println("미 입니다.");}
		else if (num>=60) {System.out.println("양 입니다.");}
		else {System.out.println("가 입니다.");}
	}
	
	public void chul() 
	{
		switch(sel) 
		{ 
		  case 1: sung_chul(kor); break;
		  case 2: sung_chul(eng); break;
		  case 3: sung_chul(mat); break;
		  default: System.out.println("잘못입력하셨습니다.");
		}
	}
}
