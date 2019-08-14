package Class_0802;

public class Cal_getset {
	// Setter를 통해서 국, 영, 수 점수를 입력하고, Getter를 통하여 합계를 출력하시오
	private int kor, eng, mat, total;
	
	public void setSubject(int kor,int eng,int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void add() {
		total = kor + eng + mat;
	}
	
	public int getTotal() {
		return total;
	}
}
