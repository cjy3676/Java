package Class_0710;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_add extends JFrame implements ActionListener { // 입력박스 두개의 합을 구하기
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Button btn = new Button("더하기");
	
	Cal_add() { 
		this.setSize(400, 100);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		add(num1);
		add(num2);
		add(btn);
		add(result);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// num1값과 num2의 값 읽어오기
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		// 값 더하기
		Integer hap = n1 + n2;
		// result에 합을 전달하기
		result.setText(hap.toString());
	}
}
