package Class_0702;

import java.awt.*;
import javax.swing.*;

public class Cal_Button extends JFrame {
	Cal_Button() // 생성자에게 컴포넌트를 추가
	{
		this.setVisible(true);
		this.setSize(300, 300);
		
		Button b = new Button("click");
		add(b);		
	}
}
