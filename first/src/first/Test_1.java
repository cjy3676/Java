package first;
import java.util.Scanner;
public class Test_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("'안녕하세요'를 반복할 횟수를 입력하시요.");
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) 
		{
			System.out.println("안녕하세요");
		}
	}
}
