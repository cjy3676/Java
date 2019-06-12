package first;
public class cal_test21 
{
	int[] lotto = new int[6];
	
	public void create()
	{
		for(int i=0; i<lotto.length; i++)
		lotto[i]=(int)(Math.random()*45)+1;
	}
	
	public void chul()
	{
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}

}
