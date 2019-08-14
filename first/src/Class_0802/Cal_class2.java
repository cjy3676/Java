package Class_0802;

public class Cal_class2 {
	int kor, eng = 60;
	Cal_class2(){
		
	}
	Cal_class2(int kor) {
		this.kor = kor;
	}
	Cal_class2(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	public void output() {
		System.out.println("гу : "+(kor+eng));
	}
}
