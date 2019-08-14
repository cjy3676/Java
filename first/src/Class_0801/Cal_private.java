package Class_0801;

public class Cal_private {
	private String pwd = "1234";
	public String check(String pwd) {
		if(this.pwd == pwd)
			return "맞음";
		else
			return "틀림";
	}
}
