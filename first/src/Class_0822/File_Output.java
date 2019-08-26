package Class_0822;

import java.io.*;

public class File_Output {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/APM_Setup/htdocs/practice/Class_0822.html");
		
		String str = "I'm Ironman";
		byte[] ss = str.getBytes();
		fos.write(ss);
	}
}
