package Class_0802;

public class Cal_getset {
	// Setter�� ���ؼ� ��, ��, �� ������ �Է��ϰ�, Getter�� ���Ͽ� �հ踦 ����Ͻÿ�
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
