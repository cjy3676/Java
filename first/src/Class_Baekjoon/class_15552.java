package Class_Baekjoon;

import java.io.*;

public class class_15552 {

	public static void main(String[] args) {
		// br�� ����Ǵ� �����Է� ���۽�Ʈ�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// bw�� ����Ǵ� ������� ���۽�Ʈ�� ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			// readLine: ��Ʈ�����κ��� �� ���� �о� ���ڿ��� ����
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String[] temp = br.readLine().split(" ");
				// write: int ������ ���� �����͸� ��¹��ڽ�Ʈ������ ��� 
				bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
			}
			// �����ִ� �����͸� ��� ��½�Ŵ
			bw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
