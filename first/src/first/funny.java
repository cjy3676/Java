package first;
import java.util.Scanner;
public class funny 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("김경하가 학원에 오는 이유?");
		sc.next();
		String sum = sc.next();
		
		if (sum.equals("공부하러")) 
		{
			System.out.println("스페인어 공부하러");
		}
		else if (sum.equals("배고파서")) 
		{
			System.out.println("점심 부수러!");
		}
		else 
		{
			System.out.println("이유가 아닙니다!");
		}
	}
}
