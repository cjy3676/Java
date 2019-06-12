package first;
import java.util.Scanner;
public class If_1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age >= 20)
		{
			System.out.println("입장하세요");
		}
		else 
		{
			System.out.println("다음에 다시 오세요");
		}
	}

}
