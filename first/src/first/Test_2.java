package first;
import java.util.Scanner;
public class Test_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ���� �Է�
		System.out.println("����, ����, ���� ������ �Է��Ͻÿ�");
		// ���� ���� �Է�
		System.out.print("����:");
		int kor = sc.nextInt();
		// ���� ���� �Է�
		System.out.print("����:");
		int eng = sc.nextInt();
		// ���� ���� �Է�
		System.out.print("����:");
		int mat = sc.nextInt();
		// �հ� ���
		int hap = kor+eng+mat;
		System.out.println("�հ�:"+hap);
		// ��� ���
		int avg = hap/3;
		System.out.println("���:"+avg);
	}
}
