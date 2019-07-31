package Class_0731;

public class Cal_total {
	int kor, eng, mat, tot, avg;
	
	public void input() {
		kor = 99;
		eng = 88;
		mat = 77;
	}
	
	public void total() {
		tot = kor + eng + mat;
		avg = tot/3;
	}
	
	public void output() {
		System.out.println("Че : "+tot);
		System.out.println("ЦђБе : "+avg);
	}
}
