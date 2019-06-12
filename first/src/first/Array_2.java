package first;
import java.util.Scanner;
public class Array_2 
{
	public static void main(String[] args) 
	{
		int a1, a2, a3, a4, a5;
		
		Scanner sc = new Scanner(System.in);
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		a4 = sc.nextInt();
		a5 = sc.nextInt();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5); 
		
		/* int[] arr = new int[n];
		   for (int i=0; i<=(n-1); i++) */
		
		int[] arr = new int[5];
		
		for (int i=0; i<=4; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<=4; i++) 
		{
			System.out.println(arr[i]);
		}
	}
}
