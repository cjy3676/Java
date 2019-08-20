package Class_0819;

class Test1 {
	// private 접근제한자는 외부X, 내부에서 처리
	// private 속성의 값을 처리하는 메소드 => getter, setter
	private Integer num1; // 속성을 만들때 첫글자는 소문자로

	public Integer getNum1() { // 값을 가져오는 getter는 return을 통해서 가져온다
		// getter명명법 => get+변수명(앞글자는 대문자)
		return num1;
	}

	public void setNum1(Integer num1) { // setter는 매개변수를 통해서 
		// setter명명법 => set+변수명(앞글자는 대문자)
		this.num1 = num1;
	}
}

class Test2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Non_Generic {
}
