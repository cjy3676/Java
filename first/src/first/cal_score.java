package first;
import java.util.Scanner;
public class cal_score 
{
	// ����, ����, ����, ���� ����
	int kor;
	int eng;
	int mat;
	int sci;
	
	// ���� �Է�
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��Ͻÿ�.");
		kor=sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�.");
		eng=sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�.");
		mat=sc.nextInt();
		System.out.println("���������� �Է��Ͻÿ�.");
		sci=sc.nextInt();
	}
	
	// �Էµ� ������ ������ ��,��,��,��,���� ���
	public void chul()
	{
		sung(kor , "�����");
		sung(eng , "�����");
		sung(mat , "���д�");
		sung(sci , "���д�");
	}
	
	// �Էµ� ������ ȣ���ϴ� �Լ�
	public void sung(int num , String nam)
	{
	    if (num>100) {System.out.println("�߸� �Է��Ͽ����ϴ�.");}
		else if (num>=90) {System.out.println(nam+"  �� �Դϴ�.");}
		else if (num>=80) {System.out.println(nam+"  �� �Դϴ�.");}
		else if (num>=70) {System.out.println(nam+"  �� �Դϴ�.");}
		else if (num>=60) {System.out.println(nam+"  �� �Դϴ�.");}
		else {System.out.println(nam+"  �� �Դϴ�.");}
	}
}
