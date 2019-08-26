package Class_0822;
import java.io.*;
public class File_Input {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/APM_Setup/htdocs/practice/Class_0715.html");
		
		byte[] input = new byte[100];
		String str = "";
		int tt;
		while((tt = fis.read(input)) != -1) {
			str = str + new String(input,0,tt);
		}
		System.out.println(str);
	}
}
