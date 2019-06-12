package first;
public class return3_main 
{
	public static void main(String[] args) 
	{
		cal_return3 re3 = new cal_return3();
		
		re3.input();
		int num1 = re3.total();
		
		re3.input();
		int num2 = re3.total();
		
		re3.input();
		int num3 = re3.total();
		
		int avg = (num1+num2+num3)/3;
		System.out.println(avg);
	}
}
