package first;
public class Cal_Const2 
{
	/*
	int kor = 99;
	
	public void chul()
	{
		int kor = 88;
		
		// chul�� �ִ� �Լ�
		System.out.println(kor);
		
		// this�� ���� class�� �ִ� �Լ�
		System.out.println(this.kor);
	}
	*/
	
	int kor;
	int eng;
	int mat;
	
	Cal_Const2(int kor,int eng, int mat)
	{
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void input(int kor,int eng,int mat)
	{
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void chul()
	{
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}
}
