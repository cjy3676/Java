package Class_0708;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Cal_action extends JFrame implements ActionListener {
	Button btn = new Button("close");
	Cal_action() {
		this.setVisible(true);
		this.setSize(300,200);
		this.setLayout(new FlowLayout());
		btn.addActionListener(this);
		add(btn);
	}
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}
