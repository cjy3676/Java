package Class_0819;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("���̾��");
		ar.add("�����̴���");
		ar.add("�丣");
		ar.add("��ũ");
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		System.out.println(ar.indexOf("�丣"));
		System.out.println(ar.contains("���̾��"));
	}

}
