package first;
import java.util.Scanner;

public class cal_class // �ΰ��� ���� ������ class
{
	int num1;
	int num2;
	int total;
	public void input() // �ΰ��� ���� �Է�
	{
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	public void cal() // �μ��� ���� ���ϰ� ���
	{
		total = num1+num2;
		System.out.println(total);
	}
}
