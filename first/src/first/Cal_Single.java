package first;
public class Cal_Single 
{
	int num1;
	int num2;
	String name;
	
	private Cal_Single(String name)
	{
		this.name = name;
	}                         
	
	public static Cal_Single getInstance()
	{
		/* �����ڰ� private�̹Ƿ� ���� class���� ��ü�� �����Ͽ� 
		      �ܺ�Ŭ������ ��ü������  return���ִ� ������� ���   */ 
		Cal_Single s = new Cal_Single("iron man");
		return s;                                               
	}

	public void input(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void cal_chul()
	{
		int total = num1+num2;
		System.out.println(name+" : "+total);
	}
	
}
