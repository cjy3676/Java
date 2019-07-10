package Class_0703;
import java.awt.*;
import javax.swing.*;
public class Cal_Button extends JFrame {
	// 속성
	Button bt = new Button("확인");
	JButton bt2 = new JButton("취소");
	// 생성자
	Cal_Button() {
		setVisible(true);
		setSize(300,300);
		// component 추가전에 레이아웃을 처리
		setLayout(new FlowLayout());
		// component 추가
		add(bt);
		add(bt2);
	}
	// 메소드
}
