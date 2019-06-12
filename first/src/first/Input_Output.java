package first;
import java.util.Scanner;
public class Input_Output 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next(); 
		System.out.println(num+str);
	}
}
