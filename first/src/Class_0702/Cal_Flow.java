package Class_0702;

import javax.swing.*;
import java.awt.*;

public class Cal_Flow extends JFrame { // 순서대로
	Cal_Flow() {
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃을 추가
		this.setLayout(new FlowLayout());
		Button b = new Button("button");
		JButton jb = new JButton("jbutton");
	}
}
