package first;
import java.util.Scanner;

public class cal_test8 
{
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("���������� �Է��Ͻÿ�.");
		kor=sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�.");
		eng=sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�.");
		mat=sc.nextInt();
	}
	
	public void sel_input()
	{
		System.out.println("���ϴ� ������ ��ȣ�� �Է��Ͻÿ�. 1.���� 2.���� 3.����");
		sel = sc.nextInt();
	}
	 
	public void sung_chul(int num) 
	{
		if (num>=90) {System.out.println("�� �Դϴ�.");}
		else if (num>=80) {System.out.println("�� �Դϴ�.");}
		else if (num>=70) {System.out.println("�� �Դϴ�.");}
		else if (num>=60) {System.out.println("�� �Դϴ�.");}
		else {System.out.println("�� �Դϴ�.");}
	}
	
	public void chul() 
	{
		switch(sel) 
		{ 
		  case 1: sung_chul(kor); break;
		  case 2: sung_chul(eng); break;
		  case 3: sung_chul(mat); break;
		  default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
