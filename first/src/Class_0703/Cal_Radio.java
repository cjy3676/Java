package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Radio extends JFrame {
	CheckboxGroup chg = new CheckboxGroup();
	Checkbox m = new Checkbox("害切",false,chg);
	Checkbox w = new Checkbox("食切",false,chg);
	
	JRadioButton jb1 = new JRadioButton("害切");
	JRadioButton jb2 = new JRadioButton("食切");
	ButtonGroup bg = new ButtonGroup();
	Cal_Radio() {
		this.setVisible(true);
		this.setBounds(300,200, 300, 300);
		this.setLayout(new FlowLayout());
		bg.add(jb1);
		bg.add(jb2);
		
		add(jb1);
		add(jb2);
		add(m);
		add(w);
	}
}
