package Class_0730;

public class class_array5 {

	public static void main(String[] args) {
		/* 0,2(1) > 4,3(2) > 3,4(3) > 2,0(4) > 1,1(5) > 2,1(6) 
		 * > 1,2(7) > 0,3(8) > 4,4(9) > 3,0(10) > 4,0(11) > 3,1(12) 
		 * > 2,2(13) > 1,3(14) > 0,4(15) > 1,4(16) > 0,0(17) > 4,1(18) 
		 * > 3,2(19) > 2,3(20) > 3,3(21) > 2,4(22) > 1,0(23) > 0,1(24) > 4,2(25) 
		 * 1. ������ ù��°�� �߾�
		 * 2. ���� ���ڴ� ��-1, ��+1 ��ġ
		 * 3. ���� ���� -1�� �ɰ��,���� ���� 4�� ����
		 * 4. ���� ������ ��� ��+2, ��-1�� ����
		 * 5. ��� ���� ���� �迭������  ��+2, ��-1�� ����   
		*/ 
		int[][] arr = new int[5][5];
		int x = 0;
		int y = 2;
		
		for(int i=1; i<=25; i++) {
			arr[x][y] = i;
			x--;
			y++;
			if(x == -1 && y == 5) {
				x = x+2;
				y = y-1;
			}
			if(x == -1) { // ���� ������ �������
				x = 4;
			}
			if(y == 5) { // ���� ������ 
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