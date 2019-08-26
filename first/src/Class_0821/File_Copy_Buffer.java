package Class_0821;

import java.io.*;

public class File_Copy_Buffer {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:/fr.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("d:/fw.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		int tt; 
		char[] input = new char[100];
		String str = "";
		while((tt = br.read(input)) != -1) {
			str = str + new String(input,0,tt);
		}
		bw.write(str);
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}

}
