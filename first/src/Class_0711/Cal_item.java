package Class_0711;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_item extends JFrame implements ItemListener {

	Choice ch = new Choice();
	Cal_item() {
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		
		ch.add("아이언맨");
		ch.add("스파이더맨");
		ch.add("토르");
		ch.add("헐크");
		ch.add("캡틴 아메리카");
		ch.add("블랙팬서");
		ch.addItemListener(this);
		add(ch);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
