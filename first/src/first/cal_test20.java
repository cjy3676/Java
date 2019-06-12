package first;
public class cal_test20 
{
	int[] pay = {100,200,150,55,88,95,56,96,88};
	int total = 0;
	
	public void hap()
	{
		for(int i=0; i<pay.length; i++)
			total = total +pay[i];
	}
	
	public void chul()
	{
		System.out.println(total);
	}
}
