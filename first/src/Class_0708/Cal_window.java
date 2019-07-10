package Class_0708;
import java.awt.*;
import java.awt.event.*;
public class Cal_window extends Frame implements WindowListener {
	Cal_window() {
		setVisible(true);
		this.setSize(300, 200);
		this.addWindowListener(this); // 현재창에 이벤트를 추가
	}
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 프로그램 종료
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
