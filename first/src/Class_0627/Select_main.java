package Class_0627;
import java.util.Scanner;
public class Select_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		Cal_select cs = new Cal_select();
		do { // while�ݺ����� ���� => ������ 1�� �����ϰ� ������ ������ 
			System.out.println("1. a���� b�� ���� ���ϱ�");
			System.out.println("2. a���� b������ ������ ��");
			System.out.println("3. ���� ��  ����� ���");
			System.out.println("4. ����");
			num = sc.nextInt();
			
			// �Է°��� ���� �ʿ��� �޼ҵ� ȣ��
			switch(num) {
			case 1: cs.add_chul(); break;
			case 2: cs.random_chul();  break;
			case 3: cs.choice_chul();  break;
			}
		} while(num != 4); // ����ڰ� 5�� �Է��ϸ� ����
	}
}
