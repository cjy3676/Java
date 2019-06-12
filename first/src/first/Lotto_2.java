package first;
public class Lotto_2 
{
	public static void main(String[] args) 
	{
		int[] num = new int[6];
		num[0]=(int)(Math.random()*45)+1;
		
		for (int i=1; i<num.length; i++) 
		{
			num[i]=(int)(Math.random()*45)+1;
			if (num[0]==num[1]) 
			{
				i = i - 1;
			}
		}
		for (int i=1; i<num.length; i++) 
		{
			System.out.print(num[i]+" ");
		}
	}
}
