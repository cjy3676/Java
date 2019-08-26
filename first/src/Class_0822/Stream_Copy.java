package Class_0822;

import java.io.*;

public class Stream_Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");
		
		long start = System.currentTimeMillis();
		int i;
		while((i = fis.read()) != -1) { // 읽기 (끝은 -1 값이 온다)
			fos.write(i); // 쓰기
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간(1/1000초) : "+(end-start));
	}
}
