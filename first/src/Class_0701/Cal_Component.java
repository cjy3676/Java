package Class_0701;
import javax.swing.*;
public class Cal_Component extends JFrame { // â ����� ������Ʈ �ϳ� �ֱ�
	Cal_Component()
	{ // swing�� �ݱ⸦ ������ ��� ����ȴ�
		this.setVisible(true);
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����
		
		JButton jb = new JButton("click");
		this.add(jb);
	}
}
