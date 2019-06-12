package first;
import java.util.Scanner;
public class return2_main 
{
	public static void main(String[] args) 
	{
		cal_return2 re2 = new cal_return2();
		
		int tot = re2.hap();
		
		System.out.println(tot);
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	}
}
