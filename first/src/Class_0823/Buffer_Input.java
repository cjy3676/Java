package Class_0823;

import java.io.*;

public class Buffer_Input {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/APM_Setup/htdocs/practice/Class_0724.html");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] data = new byte[100];
		
		while(bis.read(data) != -1) {
			System.out.println(new String(data));
		}
		/*
		 * bis.read(data);
		 * 
		 * String str = new String(data); System.out.println(str);
		 */
	}
}
