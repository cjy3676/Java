package Class_0710;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_add extends JFrame implements ActionListener { // �Է¹ڽ� �ΰ��� ���� ���ϱ�
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Button btn = new Button("���ϱ�");
	
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
		// num1���� num2�� �� �о����
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		// �� ���ϱ�
		Integer hap = n1 + n2;
		// result�� ���� �����ϱ�
		result.setText(hap.toString());
	}
}
