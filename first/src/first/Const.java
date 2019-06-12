package first;
public class Const 
{
	// 속성
	int kor;
	int eng;
	int mat;
	
	// 생산자
	Const(int k,int e, int m) 
	{
		kor=k;
		eng=e;
		mat=m;
	}
	/* 이 파일에서 입력받는 방법
	   public void input(int k,int e, int m)
	   {
	     kor=k;
	     eng=e;
	     mat=m;
	   }
	 */
	// 메소드
	public void chul()
	{
		int hap = kor+eng+mat;
		System.out.println(hap);
	}
}
