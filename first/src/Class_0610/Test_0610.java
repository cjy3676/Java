package Class_0610;
import java.util.Random;
public class Test_0610 {
	public static void main(String[] args) {
		Random r1 = new Random();
		String[] member = {"���̾��", "�����̴���", "���ͽ�Ʈ������", "�丣", "��ũ", "ĸƾ�Ƹ޸�ī"};
		int n;
		
		for(;;)
		{
			n=r1.nextInt(4); // 0~3������ �� => 3�� X
			if(n==3)  // n�� 3�϶��� for���� �ٽ� ���� => �� �ٽ� �߻� 
				continue;
			else 
				break;
		}
		
	}
}
