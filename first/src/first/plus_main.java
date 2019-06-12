package first;
import java.util.Scanner;
public class plus_main 
{
	public static void main(String[] args) 
	{
		cal_plus pl = new cal_plus();
		
		int num1;
		int num2;
		
		// num1, num2의 수를 입력
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// main에서 입력받은 수를 합을 구해서 출력
		pl.plus(num1, num2);
	}
}
