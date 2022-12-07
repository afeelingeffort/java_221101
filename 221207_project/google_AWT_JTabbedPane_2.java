import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class google_AWT_JTabbedPane_2 extends JFrame{
	JTabbedPane tp;
	JLabel lb;
	JTextArea ta;
	
	public google_AWT_JTabbedPane_2() {
		super("::google_AWT_JTabbedPane_2::");
		Container cp=this.getContentPane();
		
		tp=new JTabbedPane(JTabbedPane.LEFT);
		cp.add(tp, "Center");
		lb=new JLabel(new ImageIcon("images/스프라이트.png"));
		tp.add(lb, "상품이미지");
		
		ta=new JTextArea("문의사항");
		tp.add(new JScrollPane(ta),"QnA");
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new google_AWT_JTabbedPane_2();
	}

}
