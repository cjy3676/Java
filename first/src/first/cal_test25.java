package first;
import java.util.Scanner;
public class cal_test25 
{
	int[] kor = new int[5];
	int[] eng = new int[5];
	int[] mat = new int[5];
	int[] hap = new int[5];
	int[] avg = new int[5];
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=kor.length; i++)
		{
		kor[i]=sc.nextInt();
		eng[i]=sc.nextInt();
		mat[i]=sc.nextInt();
		}
	}
	
	public void cal()
	{
		for(int i=0; i<kor.length; i++)
		{
		hap[i]=kor[i]+eng[i]+mat[i];
		}
		for(int i=0; i<kor.length; i++)
		{
		avg[i]=hap[i]/3;
		}
	}
	
	public void chul()
	{
		for(int i=0; i<kor.length; i++)
		{
		System.out.println(hap[i]+" "+avg[i]);
		}
	}
}
