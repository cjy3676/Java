package first;
import java.util.Scanner;
public class Input 
{    
	// Ű���带 ���ؼ� �Էµ� ���� ��������
	// ���� ����� ������ ���� Ŭ���� => Scanner

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 4byte ���������� Ű����� �Էµ� ���� �����´�.
		int num2 = sc.nextInt();
		
		System.out.println(num+num2);
	}

}
