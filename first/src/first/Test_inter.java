package first;
public interface Test_inter 
{
	// interface method는 무조건 추상메소드
	// 추상클래스는 하나만 가능하지만, 인터페이스는 다중 사용이 가능하다
	// 변수는 무조건 final 
	int kor = 88; // public static final이 자동부
	public static final int eng = 99;
	
	public void hap();
	
	public abstract void chul();
}
