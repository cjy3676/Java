package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Login extends JFrame {
	// 속성 => Label 2개, TextField 2개
	Label id = new Label("아이디");
	Label pwd = new Label("비밀번호");
	TextField tid = new TextField(10);
	TextField tpwd = new TextField(10);
	
	// 생성자
	Cal_Login() {
		this.setVisible(true);
		this.setBounds(300, 200, 400, 300);
		this.setLayout(new FlowLayout());
		tpwd.setEchoChar('*');
		add(id);
		add(pwd);
		add(tid);
		add(tpwd);
	}
}
