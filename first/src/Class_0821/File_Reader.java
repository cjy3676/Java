package Class_0821;

import java.io.*;

public class File_Reader {

	public static void main(String[] args) {
		FileReader fr = new FileReader();
		int tt;
		long start = System.currentTimeMillis();
		
		char[] input = new char[100];
		String str = "";
		while((tt=fr.read(input)) != -1) {
			new String(input,0,tt); // �迭�� �ִ� �ƽ�Ű��
		}
		long end =  System.currentTimeMillis();
		System.out.println(end-start);
	}

}
