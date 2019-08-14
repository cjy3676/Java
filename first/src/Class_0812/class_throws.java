package Class_0812;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test {
	public void file_open() throws FileNotFoundException {
		FileReader fr = new FileReader("d:/ab.txt");
	}
}
public class class_throws {

	public static void main(String[] args) {
		Test t = new Test();
			try {
				t.file_open();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
