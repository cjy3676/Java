package Class_0702;

import javax.swing.*;
import java.awt.*;

public class Cal_Grid extends JFrame { // ��� ���� 
	Cal_Grid() {
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(3,2,10,10)); // (���, ����, �����, ������)
		
		Button b1 = new Button("click1");
		Button b2 = new Button("click2");
		Button b3 = new Button("click3");
		Button b4 = new Button("click4");
		Button b5 = new Button("click5");
		Button b6 = new Button("click6");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}	
}
