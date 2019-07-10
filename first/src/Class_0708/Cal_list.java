package Class_0708;
import java.awt.*;
import javax.swing.*;
public class Cal_list extends JFrame {
	List l1 = new List(5,true); // true는 복수선택, false는 1가지만
	String[] hero = {"아이언맨", "스파이더맨", "토르", "헐크", "캡틴아메리카"};
	JList jl1 = new JList(hero);
	Cal_list() {
		this.setLayout(new FlowLayout());
		this.setSize(300,100);
		l1.add("월요일");
		l1.add("화요일");
		l1.add("수요일");
		l1.add("목요일");
		l1.add("금요일");
		l1.add("토요일");
		l1.add("일요일");
		
		add(l1);
		add(jl1);
		this.setVisible(true);
	}
}
