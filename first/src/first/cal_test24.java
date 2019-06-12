package first;
import java.util.Scanner;
public class cal_test24 
{
	int[] lotto = new int[10];
	int start;
	int end;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		start=sc.nextInt();
		end=sc.nextInt();
	}
	
	public void create()
	{
		int cap = end-start+1;
		int s_num=start;
		for(int i=0; i<lotto.length; i++)
			lotto[i]=(int)(Math.random()*cap)+s_num;
	}
	public void chul()
	{
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}
}
