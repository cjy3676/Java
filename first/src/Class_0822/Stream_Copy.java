package Class_0822;

import java.io.*;

public class Stream_Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");
		
		long start = System.currentTimeMillis();
		int i;
		while((i = fis.read()) != -1) { // �б� (���� -1 ���� �´�)
			fos.write(i); // ����
		}
		long end = System.currentTimeMillis();
		System.out.println("�ɸ��ð�(1/1000��) : "+(end-start));
	}
}
