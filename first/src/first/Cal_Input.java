package first;
import java.util.Scanner;
public class Cal_Input 
{
	int kor;
	int eng;
	int mat;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}
	
	public void output()
	{
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
	}

}
