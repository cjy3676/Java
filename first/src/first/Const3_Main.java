package first;
import java.util.Scanner;
public class Const3_Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		Cal_Const3 c3 = new Cal_Const3(start,end);
		
		c3.output();
	}
}
