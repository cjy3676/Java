package first;
public class Lotto_3 
{
	public static void main(String[] args) 
	{
		int[] num = new int[6];
		
		for (int i=0; i<num.length; i++) 
		{
			num[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<=i-1; j++) 
			{
				if(num[j]==num[i])
					i = i-1;
			}
		}
		for (int i=0; i<num.length; i++) 
		{
			System.out.print(num[i]+" ");
		}
	}
}