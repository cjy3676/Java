package Class_0822;

import java.io.*;
import java.util.*;

public class Buffer_File {

	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("d:/bb.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("d:/aa.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Date today1 = new Date();
		oos.writeObject(today1);
		
		Thread.sleep(3000);
		
		Date today2 = (Date)ois.readObject();
		
		System.out.println(today1.toString());
		System.out.println(today2.toString());
		
		Date today3 = new Date();
		System.out.println(today3.toString());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
 	}
}
