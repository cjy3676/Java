package Class_0710;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cal_ave extends JFrame implements ActionListener {
	TextField num1 = new TextField(5);
	TextField num2 = new TextField(5);
	TextField result = new TextField(5);
	Button btn = new Button("¥ı«œ±‚");
	
	Cal_ave() {
		this.setSize(400, 100);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		add(num1);
		add(num2);
		add(btn);
		add(result);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		Object ob = e.getSource();
		Integer total = 0;
		for(int i=n1; i<=n2; i++) {
			total = total + i;
		}
		result.setText(total.toString());
	}
}
