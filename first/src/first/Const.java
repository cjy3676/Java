package first;
public class Const 
{
	// �Ӽ�
	int kor;
	int eng;
	int mat;
	
	// ������
	Const(int k,int e, int m) 
	{
		kor=k;
		eng=e;
		mat=m;
	}
	/* �� ���Ͽ��� �Է¹޴� ���
	   public void input(int k,int e, int m)
	   {
	     kor=k;
	     eng=e;
	     mat=m;
	   }
	 */
	// �޼ҵ�
	public void chul()
	{
		int hap = kor+eng+mat;
		System.out.println(hap);
	}
}
