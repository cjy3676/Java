package first;
public class Const4_Main 
{
	public static void main(String[] args) 
	{
		Cal_Const4 c1 = new Cal_Const4();
		
		// 1. ���� �Լ������� ������ ���� ����
		c1.n=100;
		c1.cal();
		c1.chul();
		
		// 2. �޼ҵ带 �̿�
		Cal_Const4 c2 = new Cal_Const4();
		c2.input();
		c2.cal();
		c2.chul();
		
		// 3. �����ڸ� �̿��ؼ�
		Cal_Const4 c3 = new Cal_Const4();
		c3.cal();
		c3.chul();
	}
}
