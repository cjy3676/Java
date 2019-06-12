package Class_0605;
import java.util.Scanner;
public class Hap_0605 
{
	public static void main(String[] args) 
	{
		// Math.max (둘중의 큰수)
		Math.max(100, 99);

		// Math.min (둘중의 작은수)
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
		System.out.println("합: " + total);
	}
}
