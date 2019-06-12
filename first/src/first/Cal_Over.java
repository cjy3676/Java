package first;
public class Cal_Over 
{
	int kor;
	int eng;
	// 생성자 오버로딩(똑같은 함수가 두개이상,오버로딩은 함수에서만 가능하다)
	// 매개변수의 갯수와 자료형에 따라
	// 생성자를 여러개로 만든다.
	Cal_Over() // 매개변수X
	{
		this.kor=60;
		this.eng=60;
	}
	Cal_Over(int kor) 
	{
		this.kor=kor;
		this.eng=60;
	}
	Cal_Over(double eng)
	{
		this.kor=60;
		this.eng=(int)eng;
	}
	Cal_Over(int kor,int eng) 
	{
		this.kor=kor;
		this.eng=eng;
	}
	public void chul()
	{
		System.out.println(kor+eng);
	}
}
