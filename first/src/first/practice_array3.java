package first;
public class practice_array3 
{
	public static void main(String[] args) 
	{
		int[][] arr3 = new int[7][3];
		int num = 1;
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr3[i][j] =num;
				num = num + 1;
			}
		}
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.printf("%3d",arr3[i][j]);
			}
			System.out.println();
		}
	}
}
