package Class_Baekjoon;

import java.io.*;

public class class_15552 {

	public static void main(String[] args) {
		// br에 연결되는 문자입력 버퍼스트림 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// bw에 연결되는 문자출력 버퍼스트림 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			// readLine: 스트림으로부터 한 줄을 읽어 문자열로 리턴
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String[] temp = br.readLine().split(" ");
				// write: int 형으로 문자 데이터를 출력문자스트림으로 출력 
				bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
			}
			// 남아있는 데이터를 모두 출력시킴
			bw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
