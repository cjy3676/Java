package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Textfield extends JFrame {
	// 글자입력, 글자표시
	Label la = new Label("안녕하세요");
	TextField tf = new TextField(10);
	// 생성자
	Cal_Textfield() {
		this.setVisible(true);
		this.setBounds(300, 200, 400, 200);
		this.setLayout(new FlowLayout());
		add(la);
		add(tf);
	}
}
