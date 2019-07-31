package Class_0730;
import java.util.*;
public class class_array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int x = 0;
		int y = n/2;
		
		for(int i=1; i<=25; i++) {
			arr[x][y] = i;
			x--;
			y++;
			if(x == -1 && y == 5) {
				x = x+2;
				y = y-1;
			}
			if(x == -1) { // 행이 밖으로 나간경우
				x = 4;
			}
			if(y == 5) { // 열이 밖으로 
				y = 0; 
			}
			if(arr[x][y] != 0) {
				x = x+2;
				y = y-1;
			}
			
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
