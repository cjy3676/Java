package first;
import java.util.Scanner;
public class Test4 
{   // 4. 국어 점수를 Scanner로 입력을 받아서 변수에 저장하는 프로그램을 만드시오.
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오.");
		int kor = sc.nextInt();
		
		System.out.println(kor);
	}
}
