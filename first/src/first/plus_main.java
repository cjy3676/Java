package first;
import java.util.Scanner;
public class plus_main 
{
	public static void main(String[] args) 
	{
		cal_plus pl = new cal_plus();
		
		int num1;
		int num2;
		
		// num1, num2�� ���� �Է�
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// main���� �Է¹��� ���� ���� ���ؼ� ���
		pl.plus(num1, num2);
	}
}
