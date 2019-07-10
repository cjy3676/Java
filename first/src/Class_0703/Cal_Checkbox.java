package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Checkbox extends JFrame {
	Checkbox cb1 = new Checkbox("아이언맨",true);
	Checkbox cb2 = new Checkbox("스파이더맨");
	Checkbox cb3 = new Checkbox("헐크");
	Checkbox cb4 = new Checkbox("토르");
	
	JCheckBox jcb1 = new JCheckBox("캡틴 아메리카",true);
	JCheckBox jcb2 = new JCheckBox("블랙팬서");
	JCheckBox jcb3 = new JCheckBox("닥터 스트레인지");
	JCheckBox jcb4 = new JCheckBox("앤트맨",true);
	
	Cal_Checkbox() {
		this.setVisible(true);
		this.setBounds(200, 100, 300, 300);
		this.setLayout(new FlowLayout());
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
	}
}
