package first;

public class Cal_Const4  // class : ���α׷�
{
	// �Ӽ� : ����
	int n;
	int total;
	
	// ������ : ���
	// class ���� �Ӽ��� �ʱⰪ�� �ִ� ��
    Cal_Const4()
    {
    	n=88;
    }
	
	// �޼ҵ� : ���
	public void input() 
	{
		n=99;
	}
	public void cal() // ����
	{
		for(int i=1; i<=n; i++)
		{
			total = total + i;
		}
	}
	public void chul() // ��½�
	{
		System.out.println(total);
	}
}
