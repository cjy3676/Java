package first;
import java.util.Scanner;
public class for_4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String sum = sc.next();
		String sum2 = sc.next();
		
		for(int i=1; i<=10; i++)
		{
			if(sum=="사람") 
			{
			  System.out.println(sum);
			}
			else 
			{
			  System.out.println("동물");	
			}
		}
	}

}
