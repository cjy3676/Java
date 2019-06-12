package first;
import java.util.Scanner;
public class Test7 
{   // 7. 국,영,수의 점수를 Scanner로 입력받은 후 새로운 선택값을 1,2,3 중에 하나를 입력받아서 1이 입력되면 국어점수를 출력 2를 입력받으면 영어점수를 출력, 3을 입력받으면 수학 점수를 출력하시오.
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
		// 번호에 맞는 점수 출력
		switch(swi) 
		{
		case 1: System.out.println(kor); break;
		case 2: System.out.println(eng); break;
		case 3: System.out.println(mat); break;
		default: System.out.println("잘못입력하셨습니다.");
		}
    }
}
