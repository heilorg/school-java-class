package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
	final static String USERID = "user";
	final static String USERPW = "userpw";
	JPanel jp = new JPanel();
	JButton jb = new JButton("�α���");
	JLabel idLabel = new JLabel("���̵�");
	JLabel pwLabel = new JLabel("�н�����");
	JTextField idField = new JTextField(10);
	JPasswordField pwField = new JPasswordField(10);
	
	public Login() {
		setTitle("�α���ȭ��");
		
		jp.setLayout(new FlowLayout());
		jp.add(idLabel);
		jp.add(idField);
		jp.add(pwLabel);
		jp.add(pwField);
		
		jb.addActionListener(this);
		idField.addActionListener(this);
		pwField.addActionListener(this);
		
		jp.add(jb);
		add(jp);
		setSize(500, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String pw = new String(pwField.getPassword());
		String id = new String(idField.getText());
		
		if(id.equals(USERID) && pw.equals(USERPW)) {
			JOptionPane.showMessageDialog(this, "�α��� ����");
		}else {
			JOptionPane.showMessageDialog(this, "�α��� ����");
			pwField.setText("");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
}