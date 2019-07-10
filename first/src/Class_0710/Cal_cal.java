package Class_0710;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_cal extends JFrame implements ActionListener {
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Button btn1 = new Button("더하기");
	Button btn2 = new Button("빼기");
	Button btn3 = new Button("곱하기");
	Button btn4 = new Button("나누기");
	
	Cal_cal() { 
		this.setSize(400, 100);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		add(num1);
		add(num2);
		add(btn1);
		btn1.addActionListener(this);
		add(btn2);
		btn2.addActionListener(this);
		add(btn3);
		btn3.addActionListener(this);
		add(btn4);
		btn4.addActionListener(this);
		add(result);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		Object ob = e.getSource();
		Integer imsi;
		if(ob == btn1)
			imsi=n1+n2;
		else if(ob == btn2)
			imsi=n1-n2;
		else if(ob == btn3)
			imsi=n1*n2;
		else
			imsi=n1/n2;
		result.setText(imsi.toString());
	}

}
