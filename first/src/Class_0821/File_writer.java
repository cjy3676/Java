package Class_0821;

import java.io.*;
import java.util.*;

public class File_writer {
	public static void main(String[] args) throws IOException {
		FileWriter fw1 = new FileWriter("d:/a.txt");
		FileWriter fw2 = new FileWriter("d:/b.txt");
		FileWriter fw3 = new FileWriter("d:/c.txt");
		
		String str = "I'm Ironman";
		fw1.write(str);
		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		fw2.write(str);
		
		fw3.write(str);
		
		fw1.close();
		fw2.close();
		fw3.close();
	}	
}
