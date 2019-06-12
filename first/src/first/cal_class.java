package first;
import java.util.Scanner;

public class cal_class // 두개의 값을 더해줄 class
{
	int num1;
	int num2;
	int total;
	public void input() // 두개의 값을 입력
	{
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	public void cal() // 두수의 합을 구하고 출력
	{
		total = num1+num2;
		System.out.println(total);
	}
}
