package Class_0708;
import java.awt.*;
import javax.swing.*;
public class Cal_choice extends JFrame {
	Choice c1 = new Choice(); // select 태그 
	JComboBox cb;
	String[] hero = {"아이언맨", "스파이더맨", "토르", "헐크", "캡틴아메리카"};
	Cal_choice() {
		this.setLayout(new FlowLayout());
		this.setSize(300,100);
		c1.add("월요일");
		c1.add("화요일");
		c1.add("수요일");
		c1.add("목요일");
		c1.add("금요일");
		c1.add("토요일");
		c1.add("일요일");
		add(c1);
		
		cb = new JComboBox(hero);
		add(cb);
		
		this.setVisible(true);
	}
}
