package first;
public class Cal_Over 
{
	int kor;
	int eng;
	// ������ �����ε�(�Ȱ��� �Լ��� �ΰ��̻�,�����ε��� �Լ������� �����ϴ�)
	// �Ű������� ������ �ڷ����� ����
	// �����ڸ� �������� �����.
	Cal_Over() // �Ű�����X
	{
		this.kor=60;
		this.eng=60;
	}
	Cal_Over(int kor) 
	{
		this.kor=kor;
		this.eng=60;
	}
	Cal_Over(double eng)
	{
		this.kor=60;
		this.eng=(int)eng;
	}
	Cal_Over(int kor,int eng) 
	{
		this.kor=kor;
		this.eng=eng;
	}
	public void chul()
	{
		System.out.println(kor+eng);
	}
}
