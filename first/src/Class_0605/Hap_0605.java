package Class_0605;
import java.util.Scanner;
public class Hap_0605 
{
	public static void main(String[] args) 
	{
		// Math.max (������ ū��)
		Math.max(100, 99);

		// Math.min (������ ������)
		Math.min(100, 99);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int start = Math.min(a, b);
		int end = Math.max(a, b);
		int total = 0;
		for (int i = start; i <= end; i++) {
			total = total + i;
		}
		System.out.println("��: " + total);
	}
}
