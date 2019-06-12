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
		/* 생성자가 private이므로 같은 class에서 객체를 생성하여 
		      외부클래스에 객체변수를  return해주는 방식으로 사용   */ 
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
