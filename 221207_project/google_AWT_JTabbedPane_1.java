import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class google_AWT_JTabbedPane_1 extends JFrame{
	public google_AWT_JTabbedPane_1() {
		JTabbedPane tab=new JTabbedPane();
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp1.setBackground(Color.ORANGE);
		jp2.setBackground(Color.GRAY);
		jp3.setBackground(Color.PINK);
		
		JButton jb1=new JButton("버튼1");
		JButton jb2=new JButton("버튼2");
		JButton jb3=new JButton("버튼3");
		
		jp1.add(jb1); jp1.add(jb2); jp1.add(jb3);
		
		JCheckBox jcb1=new JCheckBox("여행");
		JCheckBox jcb2=new JCheckBox("운동");
		JCheckBox jcb3=new JCheckBox("게임");
		JCheckBox jcb4=new JCheckBox("잠자기");
		
		jp2.add(jcb1); jp2.add(jcb2); jp2.add(jcb3); jp2.add(jcb4);
		
		JRadioButton jrb1=new JRadioButton("여행");
		JRadioButton jrb2=new JRadioButton("잠자기");
		JRadioButton jrb3=new JRadioButton("운동");
		JRadioButton jrb4=new JRadioButton("게임");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3); bg.add(jrb4);
		
		jp3.add(jrb1); jp3.add(jrb2); jp3.add(jrb3); jp3.add(jrb4);
		
		tab.add("버튼 탭", jp1);
		tab.add("체크박스 탭", jp2);
		tab.add("라디오버튼 탭", jp3);
		
		add(tab);
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new google_AWT_JTabbedPane_1();
	}

}
