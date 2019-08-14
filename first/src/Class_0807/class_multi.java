package Class_0807;

class parent1 {
	public void aa() {
		System.out.println("parent1");
	}
}

class parent2 {
	public void bb() {
		System.out.println("parent2");
	}	
}

class son extends parent1 { // 다중상속시 에러발생
	public void son_bb() {
	parent2 p2 = new parent2();
	p2.bb();
	}
}
public class class_multi {
	public static void main(String[] args) {
		son s = new son();
		s.aa();
		s.son_bb();
	}
}
