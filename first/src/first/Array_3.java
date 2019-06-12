package first;
import java.util.Scanner; 
public class Array_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<=4; i++) 
		{
			num[i] = sc.nextInt();
		}
		for(int i=0; i<=4; i++) 
		{
			System.out.println(num[i]);
		}
	}

}
