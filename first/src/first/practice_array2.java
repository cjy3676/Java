package first;
import java.util.Scanner;
public class practice_array2 
{
	public static void main(String[] args) 
	{
		int[][] score = new int[5][3];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				score[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<3; i++)
		{
			score[3][i]=score[0][i]+score[1][i]+score[2][i];
			score[4][i]=score[3][i]/3;
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.printf("%3d",score[i][j]);
			}
			System.out.println();
		}
	}

}
