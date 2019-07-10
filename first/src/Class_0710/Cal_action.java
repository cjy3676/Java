package Class_0710;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal_action extends JFrame implements ActionListener {
	Button btn = new Button("확인");
	
	Cal_action() {
		this.setVisible(true);
		this.setSize(300, 200);
		this.setLayout(new FlowLayout());
		
		add(btn);
		btn.addActionListener(this); // 컴포넌트에 이벤트를 장착
	}
	public void actionPerformed(ActionEvent e) { // 현재창에서 버튼을 클릭하면 실행할 내용 코딩
		this.setTitle("Hello java"); // 윈도우창의 제목
	}
}
