package Class_0715;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Cal_view extends JFrame {
	// Ŭ������ �Ӽ��� �޼ҵ�
		Connection conn;
		Statement stmt;
		ResultSet rs;
		Label name;
		Label phone;
		Label age;
		
		Cal_view() throws SQLException {
			view_frame();
		}
		
		public void view_frame() throws SQLException {
			this.setSize(300,200);
			DB_conn();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			rs.next();
			name = new Label(rs.getString("name"));
			phone = new Label(rs.getString("phone"));
			age = new Label(rs.getString("age"));
			this.setLayout(new FlowLayout());
			add(name);
			add(phone);
			add(age);
			this.setVisible(true);
		}

		// DB�� ����
		public void DB_conn() throws SQLException {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
			stmt = conn.createStatement();
		}
}
