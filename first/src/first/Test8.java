package first;
import java.util.Scanner;
public class Test8 
{   // 8. 7�� �������� �� ���� ������� ��,��,��,��,���� ����Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		int kor = sc.nextInt();
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		int eng = sc.nextInt();
		// �������� �Է�
		System.out.println("���������� �Է��Ͻÿ�.");
		int mat = sc.nextInt();
		// ��ȣ �Է�
		System.out.println("���ϴ� ������ ��ȣ�� �Է��Ͻÿ�. 1.���� 2.���� 3.����");
		int swi = sc.nextInt();
		// ��ȣ�� �´� ������ ��,��,��,��,�� ���
		switch(swi) 
		{
		case 1: 
		{
			System.out.print("����� ");
			if (kor>=90) {System.out.println("�� �Դϴ�.");}
			else if (kor>=80) {System.out.println("�� �Դϴ�.");}
			else if (kor>=70) {System.out.println("�� �Դϴ�.");}
			else if (kor>=60) {System.out.println("�� �Դϴ�.");}
			else {System.out.println("�� �Դϴ�.");}
		} break;
		case 2: 
		{
			System.out.print("����� ");
			if (eng>=90) {System.out.println("�� �Դϴ�.");}
			else if (eng>=80) {System.out.println("�� �Դϴ�.");}
			else if (eng>=70) {System.out.println("�� �Դϴ�.");}
			else if (eng>=60) {System.out.println("�� �Դϴ�.");}
			else {System.out.println("�� �Դϴ�.");}
		} break;	
		case 3:
		{
			System.out.print("���д� ");
			if (mat>=90) {System.out.println("�� �Դϴ�.");}
			else if (mat>=80) {System.out.println("�� �Դϴ�");}
			else if (mat>=70) {System.out.println("�� �Դϴ�");}
			else if (mat>=60) {System.out.println("�� �Դϴ�");}
			else {System.out.println("�� �Դϴ�.");}
		} break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
    }
}
