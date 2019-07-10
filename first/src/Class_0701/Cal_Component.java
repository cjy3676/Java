package Class_0701;
import javax.swing.*;
public class Cal_Component extends JFrame { // 창 만들고 컴포넌트 하나 넣기
	Cal_Component()
	{ // swing은 닫기를 눌러도 계속 실행된다
		this.setVisible(true);
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
		
		JButton jb = new JButton("click");
		this.add(jb);
	}
}
