package first;
import java.util.Scanner;
public class Test7 
{   // 7. ��,��,���� ������ Scanner�� �Է¹��� �� ���ο� ���ð��� 1,2,3 �߿� �ϳ��� �Է¹޾Ƽ� 1�� �ԷµǸ� ���������� ��� 2�� �Է¹����� ���������� ���, 3�� �Է¹����� ���� ������ ����Ͻÿ�.
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
		// ��ȣ�� �´� ���� ���
		switch(swi) 
		{
		case 1: System.out.println(kor); break;
		case 2: System.out.println(eng); break;
		case 3: System.out.println(mat); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
    }
}
