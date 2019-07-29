package Class_Baekjoon;
import java.util.*;
import javafx.util.*;

public class class_13460 {
	static int n, m;
	static int[][] arr;
	static Pair t, t2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // ���� ũ��
		m = sc.nextInt(); // ���� ũ��
		arr = new int[n][m]; // �� �迭
		copy = new int[n][m]; // ���� �迭
		t = new Pair(0, 0, 0, 0); // R, B�� ���ʰ�
		t2 = new Pair(0, 0, 0, 0); // ���̽��� ������ �� R, B�� ��ǥ��
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<m; j++) {
				arr[i][j] = str.charAt(j);
				// R�� B�� ��ġ�� �ޱ�
				if(arr[i][j] == 'R') {
					t.rx = i;
					t.ry = j;
				} 
				else if(arr[i][j] == 'B') {
					t.bx = i;
					t.by = j;
				}
			}
		}
		// �����̴� ������ ��� ����� ����
		solve(0,-1);
		if(result == 11) result =-1;
		System.out.println(result);
	}
	static int[][] copy;
	private static void init() {
		// R, B ��ġ �ʱ�ȭ
		t2.rx = t2.rx;
		t2.ry = t2.ry;
		t2.bx = t2.bx;
		t2.by = t2.by;
		end = false; // ���ӳ� �ʱ�ȭ
		// �� ����
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				copy[i][j] = arr[i][j];
		}
	}
	// �� �� �� ��
	static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	private static boolean lean(int d) {
		int rx = t2.rx, ry = t2.ry, dx = t2.bx, dy = t2.by;
		// R �ⱸ üũ, RB R�� �̵��� B�� ������(�������� �� ĭ �ڷ� �ű⵵��)
		boolean flagR = false, flagRB = false, flagBR = false, flagB = false;
		// ���� ���� �̵�
		while(true) {
			rx = rx + dir[d][0];
			ry = ry + dir[d][1];
			// ��ܿ� ���� �����ٸ� 
			if(copy[rx][ry] != '.') {
				// �ⱸ �ϰ��
				if(copy[rx][ry] == 'O')
					flagR = true; // R ���� üũ
				else if(copy[rx][ry] == 'B') {
					flagRB = true; // B ���� üũ
					continue; // B�� ��� �δ� ����
				}
				// # �̹Ƿ� �� ĭ �ڷ� �����ֱ�
				rx = rx - dir[d][0];
				ry = ry - dir[d][1];
				break;
			}
		}
		// R�� �����̴� B�� �����ٸ� R�� �� ĭ�ڷ� ���������Ѵ�.
		if(flagRB) {
			rx = rx - dir[d][0];
			ry = ry - dir[d][1];
		}
		// �Ķ� �̵�
		while(true) {
			bx = bx + dir[d][0];
			by = by + dir[d][1];
			// ��ܿ� ���� �����ٸ� 
			if(copy[bx][by] != '.') {
				// �ⱸ �� ���
				if(copy[bx][by] == 'O')
					flagB = true; // B ���� üũ
				else if(copy[bx][by] == 'R') {
					flagBR = true; // R ���� üũ
					continue; // R�� ��� �ϴ� �� ����
				}
				// # �̹Ƿ� �� ĭ �ڷ� �����ֱ�
				bx = bx - dir[d][0];
				by = by - dir[d][1];
				break;
			}
		}
		// R�� ������ �ʾҰ�, B�� �����̴� R�� �����ٸ�
		if(!flagRB && flagBR) {
			bx = bx - dir[d][0];
			by = by - dir[d][1];
		}
		// B�� ������ false
		if(flagB) {
			end = true; // ���� ��
			return false;
		}
		// R�� �����ٸ� true
		if(flagR) return true;
		// �ٲ� ���� �־��ֱ�
		copy[t2.rx][t2.ry] = '.';
		copy[rx][ry] = 'R';
		copy[t2.bx][t2.by] = '.';
		copy[bx][by] = 'B';
		// ���۰� �ٲ��ֱ�
		t2.rx = rx;
		t2.ry = ry;
		t2.bx = bx;
		t2.by = by;
		return false;
	}
	// �ִ� 10�̹Ƿ� 11�� ����
	static int result = 11; 
	static boolean end;
	static int[] visited = new int[10];
	private static void solve(int idx, int prev) {
		// 10������ ��� ������ �����������
		if(idx == 10) {
			// �� ����� ������ üũ�ϱ�
			init(); // copy �迭 �ʱ�ȭ
			for(int i=0; i<10; i++) {
				if(result <= i+1) return;
				if(lean(visited[i])) {
					// true��� ���� ��, ���±��� Ƚ�� �ּ� ���ϱ�
					result = Math.min(result, i+1);
					return;
				}
				// ������ �����ٸ� �ٷ� ��
				if(end) break;
			}
			return;
		}
		// ���������� ���� ���������� ������ �� �ʿ�� ����
		for(int i=0; i<4; i++) {
			if(i == prev) continue;
			visited[idx] = i;
			solve(idx + 1, i);
		}
	}
	static class Pair {
		int rx,ry,bx,by;
		Pair(int rx, int ry, int bx, int by) {
			this.rx = rx;
			this.ry = ry;
			this.bx = bx;
			this.by = by;
		}
	}
}
