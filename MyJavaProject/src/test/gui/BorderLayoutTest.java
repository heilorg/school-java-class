package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BorderLayoutTest extends JFrame implements ActionListener {
	JPanel jp = new JPanel();
	
	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JButton jb3 = new JButton("버튼3");
	JButton jb4 = new JButton("버튼4");
	JButton jb5 = new JButton("버튼5");
	
	public BorderLayoutTest() {
		super("BorderLayout");
		jp.setLayout(new BorderLayout());
		
		jp.add(jb1, "North");
		jp.add(jb2, "West");
		jp.add(jb3, "South");
		jp.add(jb4, "Center");
		jp.add(jb5, "East");

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		add(jp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //오버라이드를 안하면 에러
		if(e.getSource() == jb1) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인1");
		}
		
		if(e.getSource() == jb2) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인2");
		}
		
		if(e.getSource() == jb3) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인3");
		}
		
		if(e.getSource() == jb4) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인4");
		}
		
		if(e.getSource() == jb5) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인5");
		}
	}
}
