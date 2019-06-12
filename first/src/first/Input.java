package first;
import java.util.Scanner;
public class Input 
{    
	// 키보드를 통해서 입력된 값을 가져오기
	// 위의 기능을 정의해 놓은 클래스 => Scanner

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 4byte 정수형으로 키보드로 입력된 값을 가져온다.
		int num2 = sc.nextInt();
		
		System.out.println(num+num2);
	}

}
