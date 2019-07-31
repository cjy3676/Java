package Class_0730;

public class class_array3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int n = 1;
		for(int i=0; i<5; i++) {
			if(i%2 == 0) { // Â¦¼ö ÀÏ¶§
				for(int j=0; j<5; j++) {
					arr[i][j] = n;
					n++;
				}
			}
			else { // È¦¼ö ÀÏ¶§
				for(int j=4; j>=0; j--) {
					arr[i][j] = n;
					n++;
				}
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
