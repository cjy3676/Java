package first;
import java.util.Scanner;
public class cal_test7 
{
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in);
	
	public void input() 
	{
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		kor = sc.nextInt();
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		eng = sc.nextInt();
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		mat = sc.nextInt();
	}
	
	public void sel_input() 
	{
		System.out.println("���ϴ� ������ ��ȣ�� �Է��Ͻÿ�. 1.���� 2.���� 3.����");
		sel=sc.nextInt();
	}
	
	public void chul() 
	{
		switch(sel) 
		{
		case 1: System.out.println(kor); break;
		case 2: System.out.println(eng); break;
		case 3: System.out.println(mat); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
