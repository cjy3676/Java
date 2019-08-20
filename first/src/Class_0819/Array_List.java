package Class_0819;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("아이언맨");
		ar.add("스파이더맨");
		ar.add("토르");
		ar.add("헐크");
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		System.out.println(ar.indexOf("토르"));
		System.out.println(ar.contains("아이언맨"));
	}

}
